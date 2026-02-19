import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class MergeFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("sample.txt");
            FileInputStream fis2 = new FileInputStream("sample.txt");
            FileOutputStream fos = new FileOutputStream("Merge.txt");
            int i;
            while((i = fis1.read()) != -1) {
                fos.write(i);
            }
            fis1.close();
            while((i = fis2.read()) != -1) {
                fos.write(i);
            }
            fis1.close();
            fis2.close();
            fos.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Merged Successfully");
    }
    }