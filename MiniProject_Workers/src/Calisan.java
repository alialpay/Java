
public class Calisan { // Source Class
    private String ad;
    private String soyad;
    private int id;

    public Calisan(String ad, String soyad, int id) {  // Constructor kısım
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    public void bilgilerigoster(){ // METOD
        System.out.println("Çalışan Bilgileri...");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("ID : " + id);
    }
}
