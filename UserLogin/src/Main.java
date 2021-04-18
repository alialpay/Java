
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int girishakkı = 3;
        System.out.println("Giriş Hakkı : " + girishakkı);
        
        String sys_kullanıcı_adı = "Ali Alpay";
        String sys_parola = "1234";
        
        System.out.println("****************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println("****************");
        
        while (true) {            
            System.out.println("Kullamıcı Adı : ");
            String kullanıcı = scanner.nextLine();
            System.out.println("Parola : ");
            String parola = scanner.nextLine();
            
            parola.equals(sys_parola);
            
            if ((kullanıcı.equals(sys_kullanıcı_adı)) && (parola.equals(sys_parola))) {
                System.out.println("Hoşgeldiniz" + kullanıcı);
                break;
            }
            else if (kullanıcı.equals(sys_kullanıcı_adı) && !parola.equals(sys_parola)) {
                System.out.println("Hatalı Parola...");
                girishakkı -= 1;
                
                System.out.println("Giriş Hakkınız : " + girishakkı);
            }
            else if (!kullanıcı.equals(sys_kullanıcı_adı) && parola.equals(sys_parola)) {
                System.out.println("Hatalı Kullanıcı Adı...");
                girishakkı -= 1;
                
                System.out.println("Giriş Hakkınız : " + girishakkı);
            } 
            else{
               System.out.println("Kullanıcı Adı ve Parolanız Yanlış");
                girishakkı -= 1;
                
                System.out.println("Giriş Hakkınız : " + girishakkı);
            }
            
            if (girishakkı == 0) {
                System.out.println("Giriş hakkınız bitti, tekrar bekleriz...");
                break;
                
            }
        }
        
    }
            
}


