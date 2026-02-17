package first.src.M1.LibraryManagment;

import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryService service = new LibraryService();

        // ---------- Add Sample Books ----------
        service.getBooks().addAll(List.of(
                new Book(1, "Java Basics", "James", "Programming", 500, 3),
                new Book(2, "Data Structures", "Mark", "Programming", 600, 2),
                new Book(3, "History of India", "Rao", "History", 400, 1),
                new Book(4, "Physics Fundamentals", "Newton", "Science", 700, 2)
        ));

        // ---------- Add Sample Members ----------
        service.getMembers().addAll(List.of(
                new Member(1, "Amit", "Hyderabad", "Premium"),
                new Member(2, "Sneha", "Warangal", "Regular"),
                new Member(3, "Rahul", "Hyderabad", "Premium"),
                new Member(4, "Priya", "Bangalore", "Regular")
        ));

        // ---------- Borrow Tests ----------
        try {
            service.borrowBook(1, 1);
            service.borrowBook(1, 2);
            service.borrowBook(2, 1);
            service.borrowBook(3, 3);

            System.out.println("Borrow successful\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ---------- Exception Test ----------
        try {
            service.borrowBook(1, 3);
            service.borrowBook(1, 4);
            service.borrowBook(1, 2);  // should exceed limit
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // ---------- Return Test ----------
        try {
            service.returnBook(1, 1);
            System.out.println("Return successful\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ---------- Analytics Reports ----------
        System.out.println("Total Borrow Records: "
                + service.getRecords().size());

        System.out.println("\nBorrow Count Per Category:");
        service.getRecords().stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        r -> r.getBook().getCategory(),
                        java.util.stream.Collectors.counting()
                ))
                .forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("\nMembers Grouped By City:");
        service.getMembers().stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        Member::getCity
                ))
                .forEach((k, v) -> System.out.println(k + " : " + v.size()));

        System.out.println("\nTop Borrowed Book:");
        service.getRecords().stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        BorrowRecord::getBook,
                        java.util.stream.Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(java.util.Map.Entry.comparingByValue())
                .ifPresent(e ->
                        System.out.println(e.getKey().getTitle() + " -> " + e.getValue())
                );
    }
}

