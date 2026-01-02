package DAY8.OOPs;

public class Customer {
    int cid;
    String cname;
    String address;

    Customer(int cid){
        this.cid = cid;
    }
    Customer(int cid,String cname){
//        this.cid  = cid;
        this(cid);
        this.cname = cname;
    }
    Customer(int cid,String cname,String address){
        this.address = address;
//        this.cid = cid;
//        this.cname = cname;
        this(cid,cname);
    }

    public static void main(String[] args){
        Customer c1 = new Customer(101);
        System.out.println(c1.cid);
        Customer c2 = new Customer(101,"name");
        System.out.println(c2.cid+c2.cname);
    }
}
