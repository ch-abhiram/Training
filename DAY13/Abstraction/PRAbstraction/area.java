package DAY13.Abstraction.PRAbstraction;
abstract class shape{
    abstract double claArea();
    abstract double calPerimeter();
}

class cirlce extends shape{
    double radius;
    static double pi = 3.14;
    cirlce(double radius){
        this.radius = radius;
    }
    @Override
    public double claArea() {
        double area = pi*(radius*radius);
        return area;
    }

    @Override
    public double calPerimeter() {
        double perimeter = 2*pi*radius;
        return perimeter;

    }
}

class rectangle extends shape{
    double length;
    double breadth;
    rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double claArea() {
        double area = length*breadth;
        return area;
    }

    @Override
    double calPerimeter() {
        double perimeter = 2*(length+breadth);
        return perimeter;
    }
}
public class area {
    public static void main(String[] args) {
        shape obj;
        obj = new cirlce(2);
        System.out.println(obj.claArea()+" "+obj.calPerimeter());

        obj = new rectangle(4,2);
        System.out.println(obj.claArea()+" "+obj.calPerimeter());
    }
}
