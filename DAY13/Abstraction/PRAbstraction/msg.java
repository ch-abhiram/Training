package DAY13.Abstraction.PRAbstraction;
interface sms{
    void sendMessage(String message);
    String getStatus();
}

class email implements sms{
    String status;

    @Override
    public void sendMessage(String message) {
        System.out.println("sent message:  "+message);
        status = "email delivered successful";
    }

    @Override
    public String getStatus() {
        return status;
    }
}

class smsNotification implements sms{
    String status;

    @Override
    public void sendMessage(String message) {
        System.out.println("sent message:  "+message);
        status = "sms delivered";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
public class msg {
    public static void main(String[] args) {
        sms obj;
        obj = new email();
        obj.sendMessage("otp: 123456");
        System.out.println(obj.getStatus());

        obj = new smsNotification();
        obj.sendMessage("otp: 3452");
        System.out.println(obj.getStatus());
    }
}
