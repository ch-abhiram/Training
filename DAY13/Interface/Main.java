package DAY13.Interface;


interface calci{
    abstract int add(int a,int b);
    abstract int sub(int a,int b);
    abstract int mul(int a,int b);
}
interface calVers1 extends calci {
    abstract int Power(double a,double b);
}
 interface calVers2 extends calci{
    abstract int square(double a);
}

class basic implements calci{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }
}
class ver1 extends basic implements calVers1{
    @Override
    public int Power(double a, double b) {
        return (int) Math.pow(a,b);
    }
}
class ver2 extends basic implements calVers2{
    @Override
    public int square(double a) {
        return (int)(a*a);
    }
}
public class Main {
    static void main(String[] args) {
        calci obj = new basic();
        obj.add(2,2);


    }
}
