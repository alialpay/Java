
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        
        int i = 1;
        
        try(FileWriter writer = new FileWriter("log.txt", true)){
            writer.write("İdman Programı...\n");
            writer.write("Burpee sayısı: " + idman.getBurpeesayısı() + "\n");
            writer.write("Push Up sayısı: " + idman.getPushupssayısı() + "\n");
            writer.write("Sit Up sayısı: " + idman.getSitupsayısı()+ "\n");
            writer.write("Squat sayısı: " + idman.getSquatsayısı()+ "\n");
            
            while(idman.idmanbittimi()==false) {
            
            System.out.println("Hareket Türü (Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız? :");
            int sayı =  scanner.nextInt();
            scanner.nextLine();
            idman.hareketyap(tur, sayı);
            
            writer.write(i + ". İşlem ----->  Hareket : " + tur + " Sayı : " + sayı + "\n");
            i++;
            
        }
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("İdmanını Başarıyla Tamamladın Tebrikler !!!!!!!!!!");
        
                
        
    }
}
