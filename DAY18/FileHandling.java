package DAY18;
import java.io.*;
public class FileHandling {
    public static void main(String[] args) throws IOException {
        //create folder
        File obj = new File("D:\\Java\\first\\src\\DAY18\\Filehandling");
//        obj.mkdir();
        //create file
        File obj1 = new File(obj,"f1.txt");
        obj1.createNewFile();
        System.out.println(obj1.getAbsoluteFile());
//        File[] file = obj.listFiles();
//        for(File i: file){
//            System.out.println(i.getName());
//        }
        //Write file
//        FileWriter obj2 = new FileWriter(obj1);
//        obj2.write("hello ............");
//        obj2.write("\njai balaiya");
//        obj2.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(obj1));
        bw.write("hellooooooooooooo");
        bw.newLine();
        bw.write("kdcdfdsbvldsbcb");
        bw.close();
    }
}
