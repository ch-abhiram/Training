package DAY9.OOPs;

public class Books {
    private int noOfBooks = 100;
    public int get(){
        return noOfBooks;
    }
    public void set(int noOfBooks){
        if(noOfBooks>0){
            this.noOfBooks+=noOfBooks;
        }
    }

    static void main(String[] args) {
        Books obj = new Books();
        obj.set(100);
        System.out.println(obj.get());
    }
}
