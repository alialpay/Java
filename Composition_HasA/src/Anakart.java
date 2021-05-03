
public class Anakart {
    private String model;
    private String uretici;
    private int yuva;
    private String isletimsistemi;

    public Anakart(String model, String uretici, int yuva, String isletimsistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuva = yuva;
        this.isletimsistemi = isletimsistemi;
    }
    public void isletimsistemiyukle (String isletimsistemi) {
        this.isletimsistemi = isletimsistemi;
        System.out.println("İşletim sistemi yüklendi: " + isletimsistemi); 
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    
    /**
     * @return the yuva
     */
    public int getYuva() {
        return yuva;
    }

    /**
     * @param yuva the yuva to set
     */
    public void setYuva(int yuva) {
        this.yuva = yuva;
    }
    
    /**
     * @return the isletimsistemi
     */
    public String getIsletimsistemi() {
        return isletimsistemi;
    }

    /**
     * @param isletimsistemi the isletimsistemi to set
     */
    public void setIsletimsistemi(String isletimsistemi) {
        this.isletimsistemi = isletimsistemi;
    }

    
}
