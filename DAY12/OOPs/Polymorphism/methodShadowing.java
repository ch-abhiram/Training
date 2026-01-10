package DAY12.OOPs.Polymorphism;
class parent{
    static void demo(){
        System.out.println("from parent...");
    }
}
class child extends parent{
    static void demo(){
        System.out.println("from child...");
    }
    void display(){
        super.demo();
        demo();
    }
}
public class methodShadowing {
    static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
