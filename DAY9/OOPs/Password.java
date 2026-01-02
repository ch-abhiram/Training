package DAY9.OOPs;

public class Password {
    private String password;
    public String get(){
        return password;
    }
    public void set(String password){
        if(password!=null && password.length()>8){
            this.password = password;
        }
    }

    static void main(String[] args) {
        Password obj = new Password();
        obj.set("helloworld");
        System.out.println(obj.get());
    }
}
