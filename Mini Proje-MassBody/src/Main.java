
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
                System.err.print("Kilonuzu giriniz:");
                
                double kilo = scanner.nextDouble();
                        
                scanner.nextLine();
                
                System.err.print("Boyunuzu giriniz (örn: 1,75):");
                
                double boy = scanner.nextDouble();
                
              
                
                float indeks = (float)kilo / (float)boy * (float)boy;
                
                System.err.print("Kitle Beden İndeksiniz:" + indeks);
                
                
                //1.75 yazınca program hata veriyor. Bunun çözümü önceki videolardaydı.
                        
                        
                        
                
    }
}
