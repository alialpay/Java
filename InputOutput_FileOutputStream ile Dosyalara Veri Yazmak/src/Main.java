
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");
        try {
            fos = new FileOutputStream("dosya.txt",true);
            
            fos.write(74);
            //byte[] array = {101, 75, 66, 68};
            String s = "Ali Alpay";
            byte[] s_array = s.getBytes();
            fos.write(s_array);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found exception oluştu...");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu...");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
        }
    }
}
