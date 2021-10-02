
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void mekan_kontrol (int yas) throws IOException{
        if (yas<18) {
            throw new IOException();  //IOException check exception olduğu için hata verdi
        } 
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }

    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:");
        int yas = scanner.nextInt();
        
        mekan_kontrol(yas);
        
      /*  try {
            mekan_kontrol(yas);
        } catch (IOException ex) {
            System.out.println("IOException oluştu");
        }
        */
      
    }
}
