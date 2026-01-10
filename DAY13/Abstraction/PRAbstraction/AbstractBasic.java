package DAY13.Abstraction.PRAbstraction;
abstract class BasicCalci{
    abstract int add(int a,int b);
    abstract int sub(int a,int b);
    abstract int mul(int a,int b);

}
abstract class calVers1 extends BasicCalci{
    abstract int Power(double a,double b);
}
abstract class calVers2 extends BasicCalci{
    abstract int square(double a);
}
public class AbstractBasic {

}
