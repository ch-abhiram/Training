package DAY6.Arrays;

public class Array19 {
    public static void main(String[] args){
        int[] a = {2,3,4,5,6};
        int last = a[0];
        for(int i = 0 ;i<a.length-1;i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = last;
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
