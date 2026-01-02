package DAY9.OOPs;

public class EmpId {
    private int id;
    EmpId(int id){
        this.id = id;
        System.out.println(id);
    }

    static void main(String[] args) {
        EmpId obj = new EmpId(101);
    }
}
