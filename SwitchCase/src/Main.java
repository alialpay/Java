
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İki sayı giriniz...");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("işlem seçiniz(+,-,*,/)");
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1 :
                islem = a + b ;
                System.out.println("a+b" + (a+b));
                break;
            case 2 :
                System.out.println("a-b=" + (a-b));
                break; 
            case 3 :
                System.out.println("a*b=" + (a*b));
                break;
            case 4 :
                System.out.println("a/b=" + (a/b));
                break;    
            default:
                System.out.println("Geçerli bir işlem girmediniz.");
                break;
        }
    }
}
