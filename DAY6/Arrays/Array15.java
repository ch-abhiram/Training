package DAY6.Arrays;

public class Array15 {
    public static void main(String[] args){
        int[] a = {2,1,1,3,2,4,6,3,4,9,10,1,2};

        for(int i = 0 ;i<a.length;i++){
            int count = 1;
            if(a[i]==-1) continue;
            for(int j = i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println("frequency of element "+a[i]+ " is "+ count);
        }
    }
}
