
public class Main {
    public static void main(String[] args) {
        
        //Sekil sekil = new Sekil("Sekil");
        Sekil sekil;
        sekil = new Kare("Kare2", 6);
        
        sekil.alanhesapla();
        //sekil.cevrehesapla();  olmaz
        
        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1", 3);
        
        kare1.alanhesapla();
        daire1.alanhesapla();
        
        kare1.cevrehesapla();
        
        
    }
}
