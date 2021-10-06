
import java.util.Scanner;
class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasağınız Bulunuyor");
    }   
}
class VizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Gideceğiniz Ülkeye Vizeniz Bulunmuyor");
    } 
}
class HarcException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Lütfen Yurtdışı Harcınızı Tam yatırınız");
    } 
}

public class Yolcu {
    
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

    public void yurdışıharcıkontrol() throws HarcException {
        if (this.harc < 15) {
            
            throw new HarcException();
        }
        else {
            System.out.println("Yurtdışı harç işleminiz tamam");
            
        }
    }

    public void siyasiyasakkontrol() throws SiyasiException {
        if (this.siyasiyasak == true) {
            throw new SiyasiException();

        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
        }
    }

    public void vizedurumukontrol() throws VizeException {
        if (this.vizedurumu == true) {
            System.out.println("Vize işlemleri tamam!");
        }
        else {
            throw new VizeException();
        }
         
    }

    
    
}
