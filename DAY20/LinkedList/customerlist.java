package DAY20.LinkedList;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class customer{
    int cid;
    String name;

    customer(int cid,String name){
        this.cid = cid;
        this.name = name;
    }

    @Override
    public String toString() {
        return cid+" "+name;
    }
}
public class customerlist {
    public static void main(String[] args) {
        Vector<customer> list = new Vector<>();
        list.add(new customer(101,"babu"));
        list.add((new customer(102,"nani")));
        list.add(new customer(103,"huka"));
        list.add(new customer(104,"sarangapani"));
        list.add(new customer(105,"pani"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your id: ");
        int id = scanner.nextInt();
        Iterator<customer> itr = list.iterator();
        boolean presentId = false;
        while (itr.hasNext()){
            customer c = itr.next();
            if(c.cid == id){
                System.out.println(c.cid+" "+c.name);
                presentId = true;
                break;
            }

        }
        if(!presentId){
            System.out.println("customer not found");
        }
        scanner.nextLine();
        System.out.print("\nEnter name of the customer to delete: ");
        String nameToRemove = scanner.nextLine();
        Iterator<customer> itr1 = list.iterator();
        boolean presentName = false;
        while (itr1.hasNext()){
            customer c = itr1.next();
            if(c.name.equals(nameToRemove)){
                itr1.remove();
                System.out.println("customer removed "+c.cid+" "+c.name);
                presentName = true;
                break;
            }

        }
        if(!presentName){
            System.out.println("customer not found");
        }
        for (customer i: list){
            System.out.println(i);
        }
    }
}
