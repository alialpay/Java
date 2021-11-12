
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan iki sayının değerini değiştirin.
        
       /* 
        Scanner scanner = new Scanner(System.in);
        
        int birinci_sayı;
        int ikinci_sayı;
        
        System.err.print("Birinci Sayı : ");
        birinci_sayı = scanner.nextInt();
        
        System.err.print("İkinci Sayı : ");
        ikinci_sayı = scanner.nextInt();
        
        System.err.println("Değiştirilmeden Önce...");
        
        System.err.println("Birinci Sayı : " + birinci_sayı 
                           + "\nİkinci Sayı : " + ikinci_sayı);
        
        int gecici = birinci_sayı;
        
        birinci_sayı = ikinci_sayı;
        
        ikinci_sayı = gecici;
        
        System.err.println("Değiştirildikten Sonra...");
        
        System.err.println("Birinci Sayı : " + birinci_sayı 
                           + "\nİkinci Sayı : " + ikinci_sayı);
        */
       
       Scanner scanner = new Scanner(System.in);
    
        System.err.println("Birinci sayı : ");
           int bir;
                   bir = scanner.nextInt();
        System.err.println("İkinci sayı : ");
           int iki;
                   iki = scanner.nextInt();
           
        System.err.println("İlk hali... ");  
        System.err.print("Birinci Sayı : " + bir 
                        + " İkinci Sayı : " + iki);
           int yeni = bir;
           bir = yeni;
           bir = iki;
           iki = yeni;

        System.err.println("\nDeğiştirilmiş hali... ");   
           
        System.err.print("Yeni Birinci Sayı : " + bir 
                        + " Yeni İkinci Sayı : " + iki); 

    }
}
