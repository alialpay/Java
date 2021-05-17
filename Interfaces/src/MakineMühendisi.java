
public class MakineMühendisi implements IMuhendis, ICalısma {
    private boolean askerlik;
    private boolean adli_sicil;

    @Override
    public void calis() {
        System.out.println("Makine mühendisi çalışıyor...");
    }
    

    public MakineMühendisi(boolean askerlik, boolean adli_sicil) {
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
        
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor.");
        }
        else {
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım.");
            for(int i = 0; i<array.length ; i++){
                System.out.println(array[i]);
            }
        }
    }
    public void referans_getir(String[] array){
        
        if (array.length==0) {
            System.out.println("Herhangi bir referansım yok.");
        }
        else {
            System.out.println("Referanslarım...");
            for(int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
    
}
