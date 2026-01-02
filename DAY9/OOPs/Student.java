package DAY9.OOPs;

public class Student {
    private int marks;
    public void set(int marks){
        this.marks = marks;
    }
    public int get(){
        return marks;
    }

    static void main(String[] args) {
        Student obj = new Student();
        obj.set(100);
        System.out.println(obj.get());
    }
}
