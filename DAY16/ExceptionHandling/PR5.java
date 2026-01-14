package DAY16.ExceptionHandling;
class InternetDisconnectionException extends Exception{
    InternetDisconnectionException(String msg){
        super(msg);
    }
}
class SessionTimeoutException extends Exception{
    SessionTimeoutException(String msg){
        super(msg);
    }
}
class FileUploadFailureException extends Exception{
    FileUploadFailureException(String msg){
        super(msg);
    }
}

class Exam{
    void Examconduct(boolean internetDisconnection, boolean sessionTimeout, boolean FileUpload) throws
            InternetDisconnectionException,SessionTimeoutException,FileUploadFailureException{
        if(!internetDisconnection){
            throw new InternetDisconnectionException("Internet disconnected");
        }
        if(!sessionTimeout){
            throw new SessionTimeoutException("Session timeout");
        }
        if(!FileUpload){
            throw new FileUploadFailureException("Failed to upload file");
        }
            System.out.println("exam completed");

    }
}
public class PR5 {
    public static void main(String[] args) {
        Exam obj = new Exam();
        try{
            obj.Examconduct(false,true,false);
        }catch (InternetDisconnectionException e){
            System.out.println(e.getMessage());
        }catch (SessionTimeoutException e){
            System.out.println(e.getMessage());
        }catch (FileUploadFailureException e){
            System.out.println(e.getMessage());
        }
    }
}
