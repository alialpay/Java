
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci Sayı : ");
        int a = scanner.nextInt();
        System.out.println("İkinci Sayı : ");
        int b = scanner.nextInt();
        System.out.println("Üçüncü Sayı : ");
        int c = scanner.nextInt();
        
        int maks = -1;
        
        if ( a >= b && a >= c) {
            maks = a;
            
        }
        else if ( b >= a && b >= c) {
            maks = b;
            
        }
        else {
            maks = c;
            
        }
    
        System.out.println("Maksimum sayı : " + maks);
    }
}
