package DAY6.Arrays;

public class Array05 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int largest = a[0];
        for(int i=0;i<a.length-1;i++){

            if(largest<a[i+1]){
                largest = a[i+1];
            }

        }
        System.out.println(largest);
    }
}
