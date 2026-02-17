package first.src.M1.LibraryManagment;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<BorrowRecord> records = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<BorrowRecord> getRecords() {
        return records;
    }

    public void setRecords(List<BorrowRecord> records) {
        this.records = records;
    }

    private static final int MAX_LIMIT = 3;

    public void borrowBook(int mId,int bookId) throws MemberNotFoundException, BookNotAvailableException, BorrowLimitExceededException {
        Member member = members.stream().filter(i->i.getmId() == mId).findFirst().orElseThrow(()->
                new MemberNotFoundException(("Member not found")));

        Book book = books.stream().filter(i->i.getId() == bookId).findFirst().orElseThrow(()->
                new RuntimeException("Book not found"));

        if(book.getAvailableCopies()<=0){
            throw new BookNotAvailableException("No copies available");
        }
        long activeBorrow = records.stream().filter(i->i.getMember().getmId() == mId && !i.isReturned()).count();
        if(activeBorrow>=MAX_LIMIT){
            throw new BorrowLimitExceededException("Limit exceeded");
        }
        BorrowRecord borrowRecord = new BorrowRecord(book, member);
        records.add(borrowRecord);
        book.decreaseCopy();
    }

    public void returnBook(int memberId, int bookId) throws InvalidReturnException {

        BorrowRecord record = records.stream()
                .filter(r -> r.getMember().getmId() == memberId
                        && r.getBook().getId() == bookId
                        && !r.isReturned())
                .findFirst()
                .orElseThrow(() ->
                        new InvalidReturnException("Invalid return"));

        record.markReturned();
        record.getBook().increaseCopy();
    }

}
