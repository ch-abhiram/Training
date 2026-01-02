package DAY9.OOPs;

public class Emp {
    private int salary;

    public void set(int salary){
        if(salary>0){
            this.salary = salary;
        }
    }
    public int get(){
        return salary;
    }

    static void main(String[] args) {
        Emp obj = new Emp();
        obj.set(10000);
        System.out.println(obj.get());
    }
}
