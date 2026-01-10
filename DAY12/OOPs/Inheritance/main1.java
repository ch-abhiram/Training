package DAY12.OOPs.Inheritance;
class animal{
    void display(){
        System.out.println("animal");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("bark....");
    }
}
class  cat extends animal{
    void meow(){
        System.out.println("meow....");
    }
}
public class main1 {
    static void main(String[] args) {
//        dog d = new dog();
        cat c1 = new cat();
        animal a = c1;
        a.display();
        if(a instanceof cat){
            cat c = (cat) a;
            c.meow();
        }else {
            dog obj = (dog) a;
            obj.bark();
        }
    }
}
