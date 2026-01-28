package DAY18;

import java.io.*;

public class stufile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("D:\\Java\\first\\src\\DAY18\\Filehandling\\stu.txt");
        f.createNewFile();
        student stu = new student(101,"hiiii");

        FileOutputStream of = new FileOutputStream(f);
        ObjectOutputStream ob = new ObjectOutputStream(of);
        ob.writeObject(stu);
        ob.close();
        of.close();


        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        student obj = (student)ois.readObject();
        System.out.println(obj.sid);
        System.out.println(obj.name);


    }
}
