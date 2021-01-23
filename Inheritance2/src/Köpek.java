
public class Köpek extends Hayvan{
    
    private int dişsayısı;
    
    public Köpek(String isim, int kilo, int boy, int bacak, int dişsayısı){
        
        super(isim, kilo, boy, bacak);
        
        this.dişsayısı=dişsayısı;
        
    }
    public void hareketegec(int hız) {
        System.out.println("Köpek" + hız + " hız ile hareket ediyor");
    }
    public void koş(int hız){
        
        System.out.println("Köpek koşuyor...");
        
        super.hareketegec(hız);
                
    }

    /**
     * @return the dişsayısı
     */
    public int getDişsayısı() {
        return dişsayısı;
    }

    /**
     * @param dişsayısı the dişsayısı to set
     */
    public void setDişsayısı(int dişsayısı) {
        this.dişsayısı = dişsayısı;
    }
    
    
}
