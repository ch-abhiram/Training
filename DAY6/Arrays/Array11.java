package DAY6.Arrays;

public class Array11 {
    public static void main(String[] args){
        int[] a = {1,-1,3,-2,5};
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
    }
}
