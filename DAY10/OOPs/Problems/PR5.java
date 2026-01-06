package DAY10.OOPs.Problems;
class engine{
    engine(){
        System.out.println("engine start");
    }
}
class car{
    private engine Engine;
    car(){
        System.out.println("got in car");
    }
    void getengine(){
        if(Engine == null){
            Engine = new engine();
        }
    }
    void display(){
        getengine();
    }
}
public class PR5 {
    static void main(String[] args) {
        car obj = new car();
        obj.display();
    }
}
