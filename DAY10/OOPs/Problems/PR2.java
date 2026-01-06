package DAY10.OOPs.Problems;
class stu{
    private String name;
    private int age;
    private int Class;
    stu setName(String name){
        this.name=name;
        return this;
    }
    stu setAge(int age){
        this.age = age;
        return this;
    }
    stu setClass(int Class){
        this.Class = Class;
        return this;
    }
    void dispaly(){
        System.out.println("student name: "+name+" \nage: "+age+" \nclass: "+ Class);
    }
}
public class PR2 {
    static void main(String[] args) {
        stu obj = new stu();
        obj.setName("Huha").setAge(15).setClass(12).dispaly();
    }
}
