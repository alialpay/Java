
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı
        bilgisini alın ve sürücünün toplamda ne kadar ödemesi gerektiğini hesaplayın
        */
        Scanner scanner = new Scanner(System.in);
        
        System.err.println("Aracınız kilometrede ne kadar yakıyor?");
        
        double kurus = scanner.nextDouble();
        
        System.err.println("Kaç kilometre yol yapacaksınız?");
        
        double km = scanner.nextDouble();
        
        double tutar = km*kurus;
        
        System.err.println("Tahmini tutar:" + tutar +" tl'dir.");
        
    }
}
