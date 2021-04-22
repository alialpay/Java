
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz... Faiz oranı %6");
        
        int anapara, vade;
        System.out.println("Yatırmak İstediğiniz Tutar : ");
        anapara = scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istersiniz?");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizoranı = 0.06;
        
        for(int i = 1 ; i <= vade ; i++){
            
            toplampara = (toplampara * faizoranı) + toplampara;
            
            System.out.println(i+ ". yılın sonunda toplam para : " + (int)toplampara);
            
        }
         
    }
}
