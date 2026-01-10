package DAY11.OOPs.Inheritance;
class shape{
    String Shape = "triangle";
}
class triangle extends shape{
    double base;
    double height;
//    triangle(double base,double height){
//        this.base = base;
//        this.height = height;
//    }
    void area(){
        System.out.println(0.5*base*height);
    }
}

class RATriangle extends triangle{
    RATriangle(double base, double height) {
        super.base = base;
        super.height = height;// calling parent constructor
    }

    void display() {
        System.out.println("Shape Type: " + Shape);
        area(); // calling parent method
    }

}
public class area {
    static void main(String[] args) {
        RATriangle obj = new RATriangle(2,2);
        obj.display();
    }
}
