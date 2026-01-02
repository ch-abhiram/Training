package DAY9.OOPs;

public class Stu {
    private int age;
    public int get(){
        return age;
    }
    public void set(int age){
        if(age>0 && age<100){
            this.age=age;
        }
    }

    static void main(String[] args) {
        Stu obj = new Stu();
        obj.set(30);
        System.out.println(obj.get());
    }
}
