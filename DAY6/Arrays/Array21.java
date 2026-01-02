package DAY6.Arrays;

public class Array21 {
    public static void main(String[] args){
        int[] a = {2,4,5,6,7,8};
        int[] evenOdd = new int[a.length];
        int index = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                evenOdd[index] = a[i];
                index++;
            }
        }
        for(int i = 0;i<a.length;i++){
            if(a[i]%2!=0){
                evenOdd[index] = a[i];
                index++;
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }

}
