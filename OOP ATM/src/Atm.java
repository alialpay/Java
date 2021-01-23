
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alial
 */
public class Atm {
    public void çalış(Hesap hesap) {
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz");
        
        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**************************");
        int girişhakkı = 3;
        
        while(true) {
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız!");
                girişhakkı-=1;
                System.out.println("Kalan Giriş Hakkı: " + girişhakkı);
            }
            if (girişhakkı == 0) {
                System.out.println("Giriş Hakkınız Bitti...");
                return;
            }
        }
        System.out.println("**********************");
        String işlemler = "1. Bakiye Görüntüle\n"
                + "2. Para Yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkış için q'ya basın.";
        System.out.println(işlemler);
        System.out.println("**********************");
        
        
        while(true) {
            System.out.println("İşlemi Seçiniz: ");
            String işlem = scanner.nextLine();
            
            if (işlem.equals("q")) {
                
                break;
            }
            else if (işlem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }
            else if (işlem.equals(2)) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                hesap.parayatır(tutar);
            }
            else if (işlem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paracek(tutar);
                
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
