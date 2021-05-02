
public class Yonetici extends Calisan{
    private int sorumlukisisayisi;

    public Yonetici(int sorumlukisisayisi, String ad, String soyad, int id) { // constructor
        super(ad, soyad, id);
        this.sorumlukisisayisi = sorumlukisisayisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı :" + sorumlukisisayisi);
    }
    public void zamyap(int zammiktari){//METOD
        System.out.println(getAd() + " çalışanlara " + zammiktari + " kadar zam yapıyor :)");
        
    }
}
