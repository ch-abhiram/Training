package operaters.DAY2;

public class PR8 {
    public static void main(String[] args){
        boolean username = true;
        boolean pass = false;
        boolean otp = true;
        String login = username && pass && otp?"Login Success":"Login Failed";
        System.out.println(login);
    }
}
