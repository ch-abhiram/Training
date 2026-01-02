package DAY4.Methods;

public class PR11 {
    static void display( String b,int c){
        System.out.println("Name: "+b+" salary: "+ c);
    }
    static int totalSalary(int a ,int b){
        return a+b;
    }
    public static void main(String[] args){
        String name = "hello";
        int salary = 1000;
        int bonus = 200;
        int result = totalSalary(salary,bonus);
        display(name,result);
    }

}
