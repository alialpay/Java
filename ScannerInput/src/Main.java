
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        //kullanıcıdan yaşını öğrenmek
        
        Scanner scanner = new Scanner(System.in); //scanner objesi oluşturduk
        
        
     
        System.err.println("Lütfen yaşınızı girin");
        
        
        if(scanner.hasNextInt()){
            int yas = scanner.nextInt();
            System.err.println("Yaşınız:" + yas);
        }
        
        else {
            System.err.println("Lütfen sayı giriniz...");
        
        }
        
 

        
        /*System.err.println("Lütfen bir şeyler yazın");
        
        String yazi = scanner.nextLine();
        
        System.err.println("Yazı:" + yazi);
        */
    }
            
}
