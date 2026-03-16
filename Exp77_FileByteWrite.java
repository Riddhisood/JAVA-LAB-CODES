import java.io.FileOutputStream;

public class Exp77_FileByteWrite {

    public static void main(String[] args) {

        try {

            FileOutputStream fout = new FileOutputStream("test.txt");

            fout.write(65);

            fout.close();

            System.out.println("File written");
        }

        catch(Exception e){}
    }
}