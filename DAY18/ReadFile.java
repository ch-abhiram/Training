package DAY18;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Java\\first\\src\\DAY18\\Filehandling\\new.txt");
        f.createNewFile();
//        File f1 = new File("D:\\\\Java\\\\first\\\\src\\\\DAY18\\\\Filehandling\\n.txt");
//        f1.createNewFile();
//        f1.delete();

        BufferedWriter bf = new BufferedWriter(new FileWriter(f));
        bf.write("hehaaaa....");
        bf.newLine();
        bf.write("hehahosahdfsdcsdc");
        bf.close();
        //read file
        FileReader fr = new FileReader(f);
        int Read;
        while ((Read = fr.read()) != -1){
            System.out.print((char) Read);
        }
        fr.close();

        BufferedReader br = new BufferedReader(new FileReader(f));
        String R;
        while ((R = br.readLine()) !=null){
            System.out.println(R);
        }
        br.close();

    }
}
