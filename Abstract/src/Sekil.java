
public abstract class Sekil {
    
    private String isim;
    
    public Sekil(String isim) {
        this.isim= isim;
        
    }
    
    public void isminisoyle(){
        
        System.out.println("Bu obje " + isim + " objesidir.");
    }
    abstract void alanhesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
}
