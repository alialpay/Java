
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                + "1.Kare Alanı Hesapala\n"
                + "2.Üçgen Alanı Hesapala\n"
                + "3.Daire Alanı Hesapala\n"
                + "Çıkış : q";

        
        while (true) {  
            System.out.println(islemler);
            System.out.println("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz : ");
            String sekil_turu =scanner.nextLine();
            Sekil sekil  = null;
            
        if (sekil_turu.equals("q")) {
            System.out.println("Çıkış Yapılıyor...");
            break;
        }
        else if (sekil_turu.equals("1")) {
                System.out.print("Karenin kenar :");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare", kenar);
                sekil.alanHesabı();
            }
        else if (sekil_turu.equals("2")) {
            
            System.out.println("Taban değeri : ");
            int taban = scanner.nextInt();
            
            System.out.println("Yükseklik değeri : ");
            int yukseklik = scanner.nextInt();
            scanner.nextLine();
            
            sekil = new Ucgen("Üçgen", taban, yukseklik);
            sekil.alanHesabı();
        }
        else if (sekil_turu.equals("3")) {
            System.out.println("Dairenin yarıçarpı : ");
            int yaricap = scanner.nextInt();
            scanner.nextLine();
            sekil = new Daire("Daire", yaricap);
            
            sekil.alanHesabı();
            }
        else{
            System.out.println("Geçersiz işlem!");
        }
       
    }
    } 
}
