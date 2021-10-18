
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci("Ali Alpayy", 1960, "EEMühendisliği");
        
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            
            Ogrenci.setOgrenci_sayisi(1000);
            
            out.writeObject(ogrenci1);
        
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }
        
        
    }
}
