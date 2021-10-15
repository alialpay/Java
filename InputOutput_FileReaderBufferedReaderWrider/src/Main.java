
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
       /* try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
            while (scanner.hasNextLine()) {                
                
                String ogrenci_bilgisi = scanner.nextLine();
                
                String[] array = ogrenci_bilgisi.split(",");
                
                if (array[1].equals("Mühendis")) {
                    System.out.println("Öğrenci Bilgisi : " + ogrenci_bilgisi);
                }
                
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }
*/
       try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true))){
           writer.write("Alidesidero,Yazılım\n");
       } catch (IOException ex) {
           System.out.println("Dosya açılırken bir hata oluştu...");
       }
    }
}
