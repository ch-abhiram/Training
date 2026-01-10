package DAY13.Abstraction;
abstract class ab{
    abstract void add(int a,int b);
}
class child extends ab{
    @Override
    void add(int a, int b) {
        System.out.println(a+b);
    }
}
public class demo {
    static void main(String[] args) {
        child obj = new child();
        obj.add(2,2);
    }

}
