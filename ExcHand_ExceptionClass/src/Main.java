
import java.util.Scanner;


public class Main {
    
    public static void mekan_kontrol(int yas) throws InvalidAgeException {
        
        if (yas<18) {
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int yas = scanner.nextInt();
        
            mekan_kontrol(yas);
        
          
       
        
    }
}
