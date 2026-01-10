package DAY13.Abstraction.PRAbstraction;
class basic extends BasicCalci{
    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return a-b;
    }

    @Override
    int mul(int a, int b) {
        return a*b;
    }
}

class vers1 extends calVers1{
    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return a-b;
    }

    @Override
    int mul(int a, int b) {
        return a*b;
    }

    @Override
    int Power(double a, double b) {
        return (int) Math.pow(a,b);
    }


}

class vers2 extends calVers2{
    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return a-b;
    }

    @Override
    int mul(int a, int b) {
        return a*b;
    }

    @Override
    int square(double a) {
        return (int)(a*a);
    }
}
public class concreteChild {
}
