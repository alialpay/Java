
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("İdman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli hareketler...\n"
                + "Burpee\n"
                + "Pushup\n"
                + "Situp\n"
                + "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
                
        System.out.println("Burpee Sayısı: ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayısı: ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayısı: ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayısı: ");
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
        İdman idman = new İdman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız başlıyor...");
        
        
        while(idman.idmanbittimi()==false) {
            
            System.out.println("Hareket Türü (Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız? :");
            int sayı =  scanner.nextInt();
            scanner.nextLine();
            idman.hareketyap(tur, sayı);
            
            
            
        }
        
        System.out.println("İdmanını Başarıyla Tamamladın Tebrikler !!!!!!!!!!");
        
                
        
    }
}
