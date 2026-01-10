package DAY13.Abstraction.PRAbstraction;
abstract class car{
    private boolean isSedan;
    private int seats;
    car(boolean isSedan,int seats){
        this.isSedan = isSedan;
        this.seats = seats;
    }
    boolean getisSedan(){
        return isSedan;
    }
    int getSeats(){
        return seats;
    }
    abstract int getMileage();
}

class Wagonr extends car{
    Wagonr(){
        super(true,5);
        System.out.println("Wagnor");
    }
    @Override
    int getMileage() {
        return 20;
    }

}
class hondaCity extends car{
    hondaCity(){
        super(true,5);
        System.out.println("hondacity");
    }

    @Override
    int getMileage() {
        return 15;
    }
}
class Innova extends car{
    Innova(){
        super(false,7);
        System.out.println("Innova");
    }

    @Override
    int getMileage() {
        return 9;
    }
}
public class Main1 {
    static void main(String[] args) {
        car obj = new Wagonr();
        System.out.println("car is Sedan/not: "+obj.getisSedan()+" \nno of seats: "+obj.getSeats()+" \nmileage: "+obj.getMileage());
        System.out.println();
        car obj1 = new hondaCity();
        System.out.println("car is Sedan/not: "+obj1.getisSedan()+" \nno of seats: "+obj1.getSeats()+" \nmileage: "+obj1.getMileage());
        System.out.println();
        car obj2 = new Innova();
        System.out.println("car is Sedan/not: "+obj2.getisSedan()+" \nno of seats: "+obj2.getSeats()+" \nmileage: "+obj2.getMileage());



    }
}
