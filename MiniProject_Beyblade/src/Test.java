
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        
        System.out.println("Beyblade Dünyasına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basın...");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz?");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else {
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                
                Beyblade beyblade = fabrika.beybladeuret(islem);
                
                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                }
                else {
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.kutlsalcanavarortayacikar();
                }
            }
                
            }
        
            
    }
}
