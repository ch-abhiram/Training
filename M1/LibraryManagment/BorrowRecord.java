package first.src.M1.LibraryManagment;

public class BorrowRecord {
    private Book book;
    private Member member;
    private boolean returned;

    public BorrowRecord(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.returned = false;
    }

    public Book getBook() {

        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
    public void markReturned(){
        returned = true;
    }
}
