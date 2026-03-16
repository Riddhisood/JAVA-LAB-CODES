import java.io.FileOutputStream;

public class Exp78_FileStringWrite {

    public static void main(String[] args) {

        try {

            FileOutputStream fout = new FileOutputStream("data.txt");

            String s = "Hello Java";

            fout.write(s.getBytes());

            fout.close();

        }

        catch(Exception e){}
    }
}