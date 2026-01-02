package DAY6.Arrays;

public class Array20 {
    public static void main(String[] args){
        int[] a = {2,3,4,5,6};
        int last = a[a.length-1];
        for(int i = a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0] = last;
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
