

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        
    
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
        
            Ogrenci ogrenci = (Ogrenci)in.readObject();
            
            System.out.println(ogrenci);
            System.out.println("Öğrenci Sayısı : " + Ogrenci.getOgrenci_sayisi());
            
        }   catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        }  catch (IOException ex) {
            System.out.println("IOException oluştu...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}