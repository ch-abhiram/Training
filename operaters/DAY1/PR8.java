package operaters.DAY1;

public class PR8 {
    public static void main(String[] args){
        String usrName = "hellokitty";
        String pass = "nokitty";
        boolean notLocked = true;
        int loginAttempts = 2;
        int maxAttempts = 3;
        boolean login = usrName.equals("hellokitty") && pass.equals("nokitty") && notLocked;
        loginAttempts = login == false?loginAttempts++:loginAttempts;
        notLocked = loginAttempts<maxAttempts?true:false;
        System.out.println(login);

    }
}
