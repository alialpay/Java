
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Problemler Uygulamasına Hoşgeldiniz...");
        
        String islemler = "1. Daire Alanı Hesapla\n"
                + "2. Üçgen Çevresi Hesapla\n"
                + "3. İki Vektörün İç Çarpımlarını Hesapla\n"
                + "Çıkış : q";
        
        while (true) {            
            System.out.println(islemler);
            System.out.print("Bir işlem seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Çıkış Yapılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Yarıçap değeri giriniz: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.dairedealan(yaricap);
            }
            else if (islem.equals("2")) {
                System.out.println("Üçgenin kenar değerlerini sırasıyla giriniz");
                System.out.println("1.Kenar: " );
                int a = scanner.nextInt();
                System.out.println("2.Kenar: ");
                int b = scanner.nextInt();
                System.out.println("3.Kenar: ");
                int c = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.üçgençevresi(a, b, c);
            }
            else if (islem.equals("3")) {
                
                Vec vetor1 = new Vec("Vektör1");
                Vec vetor2 = new Vec("Vektör2");
                
                Problem.Fizik.iccarpim(vetor1, vetor2);
            }
            else{
                System.out.println("Hatalı İşlem!");
            }
        }
                
    }
}
