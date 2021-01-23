
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap); {
    Scanner scanner = new Scanner (System.in);
    String kullanıcıadı;
    String parola;
    
            System.out.println("Kullanıcı Adı: ");
            kullanıcıadı =scanner.nextLine();
            System.out.println("Parola: ");
            parola=scanner.nextLine();
            
            if (hesap.getKullanıcıadı().equals(kullanıcıadı) && hesap.getParola().equals(parola)) {
                
                return true;
       
            }
            
            else {
                return false;
            }
            
    
}
    
}
