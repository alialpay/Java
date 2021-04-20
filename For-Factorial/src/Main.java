
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    /*
        int i ;
        for ( i = 100; i >= 0; i-- ){
        System.out.println("i = " + i);
    }
    */
    Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int faktöriyel = 1 ;
        int sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++){
            faktöriyel *= i;
        }
        System.out.println("Faktöriyel = " + faktöriyel);
    
    }
}
