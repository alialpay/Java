
import java.util.Scanner;

public class Main {
    public static void mekan_kontrol (int yas) {
        if (yas<18) {
            throw new ArithmeticException();
        } 
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:");
        int yas = scanner.nextInt();
        
        try {
            mekan_kontrol(yas);
        } catch (Exception e) {
            System.out.println("18 yaşından küçükler mekana giremez...");
        }
    }
}
