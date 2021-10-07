
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da çok büyük.Lütfen daha küçük sayılar giriniz...");
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İşlem Seçiniz");
        String islem = scanner.nextLine();
        int a;
        int b;
        try{
        switch(islem){
            case "1":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamı: " + (a+b));
                break;
            case "2":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamı: " + (a-b));
                break;
            case "3":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                if (a>10000 && b>10000) {
                    throw new CarpmaException();
                }
                System.out.println("Girilen Değerlerin Toplamı: " + (a*b));
                break;
            case "4":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamı: " + (a/b));
                break;
        }
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }
        catch(InputMismatchException e) {
            System.out.println("Lütfen Inputları doğru formatta giriniz...");
        } 
        catch (CarpmaException ex) {
            ex.printStackTrace();
        }
    }
}
