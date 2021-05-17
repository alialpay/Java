
public class Main {
    public static void main(String[] args) {
        
        // IMuhendis muhendis = new IMuhendis;
        
        IMuhendis mühendis1 = new EeMuhendisi(false, false);
        
        /*mühendis1.askerlik_durumu_sorgula();
        mühendis1.adli_sicil_sorgula();
        System.out.println(mühendis1.mezuniyet_ortalamasi(2.40));
        String[] tecrübe = {"Aselsan","Havelsan","Roketsan"};
        
        mühendis1.is_tecrubesi(tecrübe);*/
        
        MakineMühendisi mühendis2 = new MakineMühendisi(true, false);
        
        String[] tecrube = {};
        String[] referans = {"Ali Koç","Tayyip Erdoğan"};
        mühendis2.adli_sicil_sorgula();
        mühendis2.askerlik_durumu_sorgula();
        System.out.println(mühendis2.mezuniyet_ortalamasi(2.10));
        mühendis2.is_tecrubesi(tecrube);
        mühendis2.referans_getir(referans);
        mühendis2.calis();
    }
}
