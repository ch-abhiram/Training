package DAY18;

import java.io.Serializable;

public class student implements Serializable {
    int sid;
    String name;
    student(int sid,String name){
        this.sid = sid;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return sid+" "+name;
//    }
}
