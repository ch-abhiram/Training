package DAY6.Arrays;

public class Array06 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int smallest = a[0];
        for(int i=0;i<a.length-1;i++){

            if(smallest>a[i+1]){
                smallest = a[i+1];
            }

        }
        System.out.println(smallest);

    }
}
