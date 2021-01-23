
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.err.print("Birinci kenar: ");
        int a = scanner.nextInt();
        System.err.print("İkinci kenar : ");
        int b = scanner.nextInt();
        double h = Math.sqrt(a*a + b*b);
        System.err.println("Hipotenüs Uzunluğunuz : " + h);
    }
}
