
import java.io.File;
import java.util.Scanner;


public class Main {
    private static Kart[][] kartlar = new Kart [4][4];

  /*  2 boyutlu arraylerle hafıza oyunu
                
        kartlar[0][0] = new Kart( 'E' );
        kartlar[0][1] = new Kart( 'A' );
        kartlar[0][2] = new Kart( 'B' );
        kartlar[0][3] = new Kart( 'F' );
        kartlar[1][0] = new Kart( 'G' );
        kartlar[1][1] = new Kart( 'A' );
        kartlar[1][2] = new Kart( 'D' );
        kartlar[1][3] = new Kart( 'B' );
        kartlar[2][0] = new Kart( 'U' );
        kartlar[2][1] = new Kart( 'R' );
        kartlar[2][2] = new Kart( 'C' );
        kartlar[2][3] = new Kart( 'U' );
        kartlar[3][0] = new Kart( 'A' );
        kartlar[3][1] = new Kart( 'L' );
        kartlar[3][2] = new Kart( 'İ' );
        kartlar[3][3] = new Kart( 'H' );
        
        */
    
    
    public static void kayittanAl(){
            File file = new File("kayit.bin");
            Scanner scanner = new Scanner(System.in);
            
            if (file.exists()) {
                
                System.out.print("Kaydedilmiş bir oyununuz var. Kayıttan devam etmek ister misiniz?(yes ya da no)");
                String cevap = scanner.nextLine();
                
                if (cevap.equals("yes")) {
                    kartlar = OyunKayit.kayittanAl();
                    return;
                }
            }
            
        kartlar[0][0] = new Kart( 'E' );
        kartlar[0][1] = new Kart( 'A' );
        kartlar[0][2] = new Kart( 'E' );
        kartlar[0][3] = new Kart( 'F' );
        kartlar[1][0] = new Kart( 'G' );
        kartlar[1][1] = new Kart( 'A' );
        kartlar[1][2] = new Kart( 'D' );
        kartlar[1][3] = new Kart( 'E' );
        kartlar[2][0] = new Kart( 'U' );
        kartlar[2][1] = new Kart( 'F' );
        kartlar[2][2] = new Kart( 'Y' );
        kartlar[2][3] = new Kart( 'U' );
        kartlar[3][0] = new Kart( 'A' );
        kartlar[3][1] = new Kart( 'L' );
        kartlar[3][2] = new Kart( 'İ' );
        kartlar[3][3] = new Kart( 'H' );
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        kayittanAl();
        
        while (oyunbittimi() == false) {            
            oyuntahtası();
            System.out.println("Çıkış için q'ya basınız...(yes ya da no)");
            String cikis = scanner.nextLine();
            
            if (cikis.equals("yes")) {
                System.out.println("Oyunu Kaydetmek İstiyor Musunuz? (yes ya da no)");
                
                String kayit = scanner.nextLine();
                
                if (kayit.equals("yes")) {
                    OyunKayit.oyunKaydet(kartlar);
                }
                else {
                    System.out.println("Oyun Kaydedilmedi...");
                }
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            
            
            tahminet();
        }
    }    
        public static void tahminet(){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Birinci Tahmin (i ve j değerlerini bir boşluklu girin...)");
            int i1 = scanner.nextInt();
            int j1 = scanner.nextInt();
            
            kartlar[i1][j1].setTahmin(true);
            oyuntahtası();
             System.out.print("İkinci Tahmin (i ve j değerlerini bir boşluklu girin...)");
            int i2 = scanner.nextInt();
            int j2 = scanner.nextInt();
            
            if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
                System.out.println("Doğru tahmin.Tebrikler!");
                kartlar[i2][j2].setTahmin(true);
                
            }
            else{
                System.out.println("Yanlış tahmin...");
               kartlar[i1][j1].setTahmin(false);
            }
        
    }
    public static void oyuntahtası(){
        for(int i = 0; i<4; i++){
          System.out.println("- - - - - - - -");
            for(int j = 0; j<4; j++){
                if (kartlar[i][j].isTahmin()){
                    System.out.print("|" + kartlar[i][j].getDeger() + "|");
                }
                else{
                    System.out.print("| | ");
                }
            }System.out.println("");
        }System.out.println("- - - - - - - -");
    }
    public static boolean oyunbittimi(){
        for(int i =0; i<4 ; i++){
            for(int j = 0; j<4; j++){
                if (kartlar[i][j].isTahmin()== false) {
                    return false;
                }
            }
               
        }
        return true;
    }
    

}
