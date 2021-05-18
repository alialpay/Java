
import java.util.Scanner;


public class Yolcu implements IKurallar{
    
    private int harc;
    private boolean siyasiyasak;
    private boolean vizedurumu;
    
    public Yolcu() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Siyasi yasağınız bulunuyor mu?");
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            this.siyasiyasak = true;
        }
        else {
            this.siyasiyasak = false;
        }
        
        System.out.println("Vizeniz var mı?");
        
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.vizedurumu = true;
        }
        else {
            this.vizedurumu = false;
        }
        
        
        
        
    }

    @Override
    public boolean yurdışıharcıkontrol() {
        if (this.harc < 15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırınız...");
            return false;
        }
        else {
            System.out.println("Yurtdışı harç işleminiz tamam");
            return true;
        }
    }

    @Override
    public boolean siyasiyasakkontrol() {
        if (this.siyasiyasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız...");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizedurumukontrol() {
        if (this.vizedurumu == true) {
            System.out.println("Vize işlemleri tamam!");
            return true;
        }
        else {
            System.out.println("Gitmek istediğiniz ülkeye vizeniz bulunmamaktadır...");
            return false;
        }
         
    }

    
    
}
