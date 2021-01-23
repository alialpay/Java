
public class Hesap {
    
    private String kullanıcıadı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcıadı, String parola, int bakiye) {
        this.kullanıcıadı = kullanıcıadı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void parayatır(int tutar) {
        
        bakiye+=tutar;
        System.out.println("Yeni Bakiyeniz: " + bakiye);
        
    }
    public void paracek(int tutar) {
        
        if ((bakiye-tutar) < 0) {
            System.out.println("Yeterli bakiyeniz yok...");
        }
        else {
            bakiye -=tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
    
    
}
