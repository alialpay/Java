
public class Hayvan {
    
    private String isim;
    private int kilo;
    private int boy;
    private int bacak;
    
    
    public Hayvan(String isim, int kilo, int boy, int bacak) {
        
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak = bacak;
        
    }
    
    public void yemeykye(){
    
            System.out.println("Hayvan şuan yemek yiyor...");
}
    
    public void hareketegec(int hız){
        System.out.println("Hayvan " + hız + " hız ile hareket ediyor.");
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the bacak
     */
    public int getBacak() {
        return bacak;
    }

    /**
     * @param bacak the bacak to set
     */
    public void setBacak(int bacak) {
        this.bacak = bacak;
    }
    
    
}
