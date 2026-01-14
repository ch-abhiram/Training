package DAY16.ExceptionHandling;
class TemperatureOutOfRangeException extends Exception{
    TemperatureOutOfRangeException(String msg){
        super(msg);
    }
}

class temp{
    void Temp(int temperature) throws TemperatureOutOfRangeException{
        if(temperature<-50 || temperature>100){
            throw new TemperatureOutOfRangeException("temprature out of range");
        }else {
            System.out.println("Todays temperature "+temperature);
        }
    }
}
public class PR2 {
    public static void main(String[] args) {
        temp obj = new temp();
        try{
            obj.Temp(50);
        }catch (TemperatureOutOfRangeException e){
            System.out.println(e.getMessage());
        }
    }
}
