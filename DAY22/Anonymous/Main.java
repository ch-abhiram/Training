package DAY22.Anonymous;
interface Calci{
    int add(int a, int b);
    void printEvenNum(int a,int b);
}
public class Main {
    public static void main(String[] args) {
        Calci obj = new Calci(){
            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public void printEvenNum(int a, int b) {
                for(int i = a;i<=b;i++){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
            }
        };
        System.out.println(obj.add(2,2));
        obj.printEvenNum(2,20);
    }
}
