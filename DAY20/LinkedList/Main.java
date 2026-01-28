package DAY20.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

class emp{
    int empid;
    String empName;
    emp(int empid,String empName){
        this.empid = empid;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return empid+" "+empName;
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<emp> list = new LinkedList<>();

        list.add(new emp(101,"hari"));
        list.add(new emp(102,"krishna"));
        list.add(new emp(103,"kumar"));
        list.add(new emp(104,"sai"));
        System.out.println("Total emp");
        for(emp i : list){
            System.out.println(i);
        }
        int search = 101;
        Iterator<emp> itr = list.iterator();
        while(itr.hasNext()){
            emp e = itr.next();
            if(e.empid == search){
                itr.remove();
                System.out.println("Employee id "+search +" is removed");
                break;
            }
        }
        System.out.println("Remaining emps"+list);
    }
}
