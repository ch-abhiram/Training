package DAY6.ArraysMethods;

public class PR2 {
    static int greatestScore(int[] a){
        int great = a[0];
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]>great){
                great = a[i+1];
            }
        }
        return great;
    }
    public static void main(String[] args){
        int[] score = {240,120,320,100,49,69};
        int result = greatestScore(score);
        System.out.println(result);
    }
}
