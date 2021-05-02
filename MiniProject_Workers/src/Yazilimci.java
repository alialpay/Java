
public class Yazilimci extends Calisan{ // Alt Class
    private String diller;
    

    public Yazilimci(String diller, String ad, String soyad, int id) { // CONSTRUCTOR
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formatat(String isletimsistemi){ // METOD
        System.out.println(getAd() + " " + isletimsistemi + "'ni yüklüyor..");
        
        
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Yazılımcının Bildiği Diller: " + diller);
    }
    
}
