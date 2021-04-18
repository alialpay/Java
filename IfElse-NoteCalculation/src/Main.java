
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        /*
        System.out.println("Yaşınızı giriniz:");
        int yas = scanner.nextInt();
        
        if (yas >= 18) { 
            System.out.println("Hoşgeldiniz :) ");
        }
        else {
            System.out.println("18 yaşından küçükler giremez :( ");
        }
        */
        System.out.println("*************************");
        System.out.print("Vize1 notunuzu giriniz : ");
        int vize1 = scanner.nextInt();
        System.out.print("Vize2 notunuzu giriniz : ");
        int vize2 = scanner.nextInt();
        System.out.print("Final notunuzu giriniz : ");
        int fin = scanner.nextInt();
        System.out.println("*************************");
        
        double not = (vize1 * 0.30) + (vize2 * 0.30) + (fin * 0.40);
        System.out.println("Ortalama notunuz:" + not);
        if (85<= not && not<=100) {
            System.out.println("Harf notunuz AA");
        }
        else if (75<= not && not<85) {
            System.out.println("Harf notunuz BB");
        }
         else if (55<= not && not<75) {
            System.out.println("Harf notunuz CC");
        }
         else if (35<= not && not<55) {
            System.out.println("Harf notunuz DD");
            System.out.println("Büte de bekleriz :) ");
        }
         else if (not < 35) {
            System.out.println("Harf notunuz FF");
            System.out.println("Seneye görüşürüz :) ");
        }
         else {
             System.out.println("Geçerli bir not giriniz.");
        }
        
    }
}
