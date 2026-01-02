package DAY6.ArraysMethods;

public class PR1 {
    static int search(int[] a,int b){
        for(int i = 0;i<a.length;i++){
            if(a[i]==b){
              return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int element = 4;
        System.out.println(search(a,element));
    }
}
