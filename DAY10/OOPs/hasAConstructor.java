package DAY10.OOPs;
class Enginee{
    private int hp;
    Enginee(int hp){
        this.hp = hp;
    }
}

class Carr{
    private int model;
    private Enginee e;

    Carr(int model,int hp){
        this.model = model;
        this.e = new Enginee(hp);
    }

}
public class hasAConstructor {
    static void main(String[] args) {
        Carr c = new Carr(101,102);
    }
}
