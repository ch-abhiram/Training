package DAY6.Arrays;

public class Array13 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int element = 4;
        for(int i = 0;i<a.length;i++){
            if(a[i]==element){
                System.out.println("index "+i);
            }
        }
    }
}
