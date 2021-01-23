
public class Calisan {  // superClass ya da BaseClass denir
    
    private String isim;
    private int maas;
    private String departman;
    
    public Calisan(String isim, int maas, String departman) {
        
       this.isim = isim;
       this.maas = maas;
       this.departman = departman;
        
    }
    public void calis(){
        System.out.println("Çalışan Çalışıyor...");
    }
    public void bilgilerigoster() {
        
        System.out.println("İsim : "+ this.isim);
        System.out.println("Maaş : " + maas);
        System.out.println("Departman : "  + departman);
    }
    public void departmandegistir (String yenidepartman) {
        
        System.out.println("Departman değiştiriliyor...");
        this.departman = yenidepartman;
        
        System.out.println("Yeni departman: " + this.departman);
        
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
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
