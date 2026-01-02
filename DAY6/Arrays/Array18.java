package DAY6.Arrays;

public class Array18 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int element = 5;
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                System.out.println("index of the element: "+element+" is "+i);
            }
        }
    }
}
