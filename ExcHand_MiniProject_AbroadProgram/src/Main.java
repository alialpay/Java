
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
        
        String sartlar = "Yurtdışı Çıkış Kuralları\n"
                +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                + "15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
        
        while (true) {            
            System.out.println("******************************************************");
            System.out.println(sartlar);
            System.out.println("******************************************************");
            
            Yolcu yolcu = new Yolcu();
            
            
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.yurdışıharcıkontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
            
            
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.siyasiyasakkontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.vizedurumukontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("İşlemleriniz Tamam! Güle Güle...");
            break;
      
        }
    }
}
