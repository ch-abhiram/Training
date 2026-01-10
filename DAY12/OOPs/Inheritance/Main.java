package DAY12.OOPs.Inheritance;
class employee extends person{
    int eid;
    String role;
    employee(String name,String address,int eid,String role){
        super(name,address);
        this.eid = eid;
        this.role = role;
    }
}
class person{
    String name;
    String address;
    person(String name,String address){
        this.name = name;
        this.address = address;
    }
}
public class Main {
    static void main(String[] args) {
        employee e = new employee("hello","hello",101,"hello");
        person p = e;  //upcasting
        System.out.println(p.name);
        System.out.println(p.address);
//        System.out.println(p.eid);
//        System.out.println(p.role);

        employee e1 = (employee)p; // downcasting
        System.out.println(e1.name);
        System.out.println(e1.address);
        System.out.println(e1.eid);
        System.out.println(e1.role);
    }
}
