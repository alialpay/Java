
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.err.println("Yaşınız nedir?");
        int yas = scanner.nextInt();
        
        scanner.nextLine(); // Dummy
        
        System.err.println("İsminiz nedir?");
        String isim = scanner.nextLine();
        
        System.err.println("Yaş:" + yas);
        System.err.println("İsim:" + isim);
        
    }
}
