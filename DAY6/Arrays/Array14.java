package DAY6.Arrays;

public class Array14 {
    public static void main(String[] args){
        int[] a = {2,0,3,0,5};
        int count = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i]!=0){
                a[count] = a[i];
                count++;
            }
        }
        for(int i = count;i<a.length;i++){
            a[i] = 0;
        }
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
