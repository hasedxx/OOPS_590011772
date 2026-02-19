import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class readwrite {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.txt");
            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
            fis.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
                String data = "Hello Naved!";
                fos.write(data.getBytes());
                fos.close();
                System.out.println("Data written successfully.");
            }
        catch (IOException e) {
        System.out.println(e);
    }
    }
}