
public class Beyblade {
    private String beybladeci;
    private int donushizi;
    private int saldirigucu;

    public Beyblade(String beybladeci, int donushizi, int saldirigucu) {
        this.beybladeci = beybladeci;
        this.donushizi = donushizi;
        this.saldirigucu = saldirigucu;
    }


    public String getBeybladeci() {
        return beybladeci;
    }


    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }


    public int getDonushizi() {
        return donushizi;
    }


    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }


    public int getSaldirigucu() {
        return saldirigucu;
    }


    public void setSaldirigucu(int saldirigucu) {
        this.saldirigucu = saldirigucu;
    }
    
    public void saldir(){
        System.out.println(getBeybladeci() + " " + saldirigucu + " ve " + donushizi + " ile saldırıyor...");
    }
    
    public void kutlsalcanavarortayacikar () {
        System.out.println("Bu Beyblade'in kutsal canavarı bulunmuyor.");
    }
    
    public void bilgilerigoster() {
        System.out.println("Beybladeci İsmi : " + beybladeci);
        System.out.println("Saldırı Gücü : " + saldirigucu);
        System.out.println("Dönüş Hızı : " + donushizi);
    }
    
    
    
    
    
    
}
