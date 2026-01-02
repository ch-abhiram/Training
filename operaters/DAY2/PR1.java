package operaters.DAY2;

public class PR1 {
    public static void main(String[] args){
        int sub1 = 40;
        int sub2 = 60;
        int sub3 = 70;
        int totalMarks = sub1+sub2+sub3;
        String output = sub1>40 && sub2>40 && sub3>40?"Pass":"Fail";
        System.out.println(output+" total marks: "+totalMarks);
    }
}
