package DAY13.Abstraction.PRAbstraction;
abstract class Vehicle{
    abstract void start();
    abstract void stop();
    abstract void getFuel();
}

class Car extends Vehicle{
    int fuel;
    Car(int fuel){
        this.fuel = fuel;
        stop();
        getFuel();
        start();
    }

    @Override
    void start() {
        System.out.println("start the car......");
    }

    @Override
    void stop() {
        System.out.println("stop the car......");
    }
    @Override
    void getFuel(){
        System.out.println("filling fuel "+fuel);
    }
}

class bike extends Vehicle{
    int fuel;
    bike(int fuel){
        this.fuel = fuel;
        stop();
        getFuel();
        start();

    }

    @Override
    void start() {
        System.out.println("start the bike......");
    }

    @Override
    void stop() {
        System.out.println("stop the bike......");
    }

    @Override
    void getFuel(){
        System.out.println("filling fuel "+fuel);
    }
}
public class transport {
    public static void main(String[] args) {
        Vehicle obj;
        obj = new Car(25);
        obj = new bike(10);
    }
}
