
import jdk.nashorn.internal.ir.BreakNode;


public class EeMuhendisi implements IMuhendis{
    private boolean askerlik;
    private boolean adli_sicil;

    public EeMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    @Override
    public void askerlik_durumu_sorgula() {
        
        if (askerlik) {
            System.out.println("Askerliğimi Yaptım.");
        }
        else {
            System.out.println("Askerliğimi Henüz Yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        
        return "Ortalamam" + derece;
        
    }

    @Override
    public void adli_sicil_sorgula() {
        
        if (adli_sicil) {
            
            System.out.println("Adli Sicil Kaydım Bulunuyor.");
            
        }
        else {
            System.out.println("Herhangi Bir Adli Sicil Kaydım Bulunmuyor.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        
        System.out.println("Developer Olarak Şu Şirketlerle Çalıştım...");
        
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
            
        }
        
    }
    
}
