package DAY9.OOPs;

public class Phone {
    private int volume = 100;
    public int get(){
        return volume;
    }

    static void main(String[] args) {
        Phone obj = new Phone();
        System.out.println(obj.get());
    }
}
