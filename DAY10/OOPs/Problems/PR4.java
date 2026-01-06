package DAY10.OOPs.Problems;
class Book{
    private String name;
    private int id;
    private String title;
    Book(int id,String title,String name){
        this.id = id;
        this.name = name;
        this.title = title;
    }
    void display(){
        System.out.println(id+" | "+name+" | "+title);
    }

}
class library{
    private Book[] books;
    library(){
        books = new Book[23];
        books[0]  = new Book(1, "Java Basics", "James Gosling");
        books[1]  = new Book(2, "OOP Concepts", "Bjarne Stroustrup");
        books[2]  = new Book(3, "Data Structures", "Mark Allen Weiss");
        books[3]  = new Book(4, "Algorithms", "CLRS");
        books[4]  = new Book(5, "Operating Systems", "Galvin");
        books[5]  = new Book(6, "Computer Networks", "Tanenbaum");
        books[6]  = new Book(7, "DBMS", "Ramakrishnan");
        books[7]  = new Book(8, "Compiler Design", "Aho");
        books[8]  = new Book(9, "Software Engineering", "Pressman");
        books[9]  = new Book(10, "Python Programming", "Guido");
        books[10] = new Book(11, "C Programming", "Dennis Ritchie");
        books[11] = new Book(12, "C++ Programming", "Stroustrup");
        books[12] = new Book(13, "Machine Learning", "Andrew Ng");
        books[13] = new Book(14, "Artificial Intelligence", "Russell");
        books[14] = new Book(15, "Cyber Security", "Stallings");
        books[15] = new Book(16, "Web Development", "Jon Duckett");
        books[16] = new Book(17, "Cloud Computing", "Rajkumar Buyya");
        books[17] = new Book(18, "DevOps", "Jez Humble");
        books[18] = new Book(19, "Blockchain", "Don Tapscott");
        books[19] = new Book(20, "IoT Basics", "Bahga");
        books[20] = new Book(21, "Android Development", "Google");
        books[21] = new Book(22, "iOS Development", "Apple");
        books[22] = new Book(23, "GATE CS Guide", "Made Easy");
    }
    void display(){
        for(Book i : books){
            i.display();
        }
    }
}
public class PR4 {
    static void main(String[] args) {
        library obj = new library();
        obj.display();
    }
}
