
import java.util.Scanner;


public class Test {
    private static Singer singer = new Singer();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleribastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    public static void sarkicigoruntule(){
        singer.sarkicilaribastir();
    }
    public static void sarkiciekle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi:");
        String isim = scanner.nextLine();
        singer.sarkiciekle(isim);
    }
    public static void sarkiciguncelle(){
        System.out.println("Güncellemek istediğiniz pozisyon:");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeniisim = scanner.nextLine();
        singer.sarkiciguncelle(yeniisim, (pozisyon-1));
    }
    public static void sil(){
        System.out.println("Silmek isstediğiniz şarkıcının pozisyonu:");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        singer.sarkicisil(pozisyon-1);
    }
    public static void ara(){
        System.out.println("Şarkıcının ismini giriniz:");
        String isim = scanner.nextLine();
        
        singer.sarkiciara(isim);
    }
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");
        
        islemleribastir();
        
        boolean çıkış = false;
        int islem;
        
        while (!çıkış) {            
            System.out.print("Bir işlem seçiniz:");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem) {
                case 0: 
                    islemleribastir();
                    break;
                case 1:
                    sarkicigoruntule();
                    break;
                case 2:
                    sarkiciekle();
                    break;
                case 3:
                    sarkiciguncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    çıkış = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                    
            }
            
        }
        
    }
}
