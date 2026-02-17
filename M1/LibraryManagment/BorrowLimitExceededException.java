package first.src.M1.LibraryManagment;

public class BorrowLimitExceededException extends Exception{
    BorrowLimitExceededException(String msg){
        super(msg);
    }
}
