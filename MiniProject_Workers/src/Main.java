
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        
        String islemler = "İşlemler..\n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici İşlemleri \n"
                + "Çıkış için q'ya basın...";
        
        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");
        
        while (true) {            
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Programdan Çıkılıyor...");
                break;  
                
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Java, C#", "Ali", "Alpay", 88);
                String yazilimciislem = "1. Format At\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basın...";
                System.out.println(yazilimciislem);
                        
                OUTER:
                while (true) {
                    System.out.print("İşlemi Seçiniz:");
                    String yislem = scanner.nextLine();
                    switch (yislem) {
                        case "q":
                            System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                            break OUTER;
                        case "1":
                            System.out.println("İşletim sistemi : ");
                            String isletimsistemi = scanner.nextLine();
                            yazilimci.formatat(isletimsistemi);
                            break;
                        case "2":
                            yazilimci.bilgilerigoster();
                           break;
                        default:
                            System.out.println("Geçersiz yazılımcı işlemi!");
                            break;
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici(100, "Muhammed","Bey" , 20);
                String yoneticiislem = "Yönetici İşlemleri\n"
                        + "1. Zam Yap\n"
                        + "2. Bilgileri Göster\n"
                        + "3. Çıkış için q'ya basın...";
                System.out.println(yoneticiislem);
                
                
                while(true) {
                    System.out.println("İşlem seçiniz...");
                    String yislem = scanner.nextLine();
                    
                    if (yislem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (yislem.equals("1")) {
                        System.out.print("Ne kadar zam yapmak istiyorssunuz : ");
                        int zammiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamyap(zammiktari);
                    }
                    else if (yislem.equals("2")) {
                        yonetici.bilgilerigoster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi!");
                            
                    }
                    
                }
            }
            else {
                System.out.println("Geçersiz İşlem!");
            }
        }
    
    }
}
