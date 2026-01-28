package DAY23.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Emp{
    int eid;
    String name;
    Double Salary;

    public Emp(int eid, String name, Double Salary) {
        this.eid = eid;
        this.name = name;
        this.Salary = Salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Double getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return eid+" "+name+" "+Salary;
    }
}
public class salary {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>(Arrays.asList(
                new Emp(101,"peru",300000.0),
                new Emp(102,"naperu",20000.0),
                new Emp(103,"nana",40000.0),
                new Emp(104,"lelele",10000.0)
        ));

        list.stream().filter(i->i.getSalary()>30000)
                .forEach(System.out::println);
    }
}
