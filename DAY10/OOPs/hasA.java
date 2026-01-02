package DAY10.OOPs;
class engine{
    void start(){
        System.out.println("Engine start");
    }
}

class car{
    engine e = new engine();
    void display(){
        e.start();
        System.out.println("go");
    }
}
public class hasA {
    static void main(String[] args) {
        car obj = new car();
        obj.display();
    }
}
