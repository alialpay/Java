
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static String harfnotuHesapla(String isim, int vize1, int vize2, int finalnot){
        String cıktı = "";
        double toplamnot = (vize1*3/10.0) + (vize2*3/10.0) + (finalnot*4/10.0);
        
        if (toplamnot >= 90) {
            cıktı = isim + " Bu dersten AA notu aldı";
        }
        else if (toplamnot >=85) {
            cıktı = isim + " Bu dersten BA notu aldı";
        }
        else if (toplamnot >=75) {
            cıktı = isim + " Bu dersten BB notu aldı";
        }
        else if (toplamnot >=60) {
            cıktı = isim + " Bu dersten CB notu aldı";
        }
        else if (toplamnot >=50) {
            cıktı = isim + " Bu dersten CC notu aldı";
        }
        else if (toplamnot >=40) {
            cıktı = isim + " Bu dersten DC notu aldı";
        }
        else if (toplamnot >=35) {
            cıktı = isim + " Bu dersten DD notu aldı";
        }
        else {
            cıktı = isim + " Bu dersten FF notu aldı";
        }
        return cıktı;
        
    }
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"));
            FileWriter writer = new FileWriter("harfnotları.txt")){
            
            while (scanner.hasNextLine()) {
                String ogrenciBilgileri = scanner.nextLine();
                
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);
                String cıktı = harfnotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                
                writer.write(cıktı +"\n");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
