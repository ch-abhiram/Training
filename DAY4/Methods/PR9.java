package DAY4.Methods;

public class PR9 {
    static char totalMarks(int a, int b, int c){
        int total = a+b+c;
        if(total>=60){
            return 'P';
        } else {
            return 'F';
        }

    }
    public static void main(String[] args){
        System.out.println(totalMarks(10,10,10));
    }
}
