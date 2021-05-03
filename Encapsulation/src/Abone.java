
public class Abone {
    
    public String isim;
    public int bakiye;
    
    public String sehir;
    
    public void dogalgazkullan (int miktar){
        if ((this.bakiye - miktar) < 0) {
            System.out.println("Yeterli bakiye yok!");
        }
        else{
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir. Kredi yükleyiniz..."
                        + "Kredi limiti = 120 TL");
            }
            else{
                System.out.println("Yeni bakiye = " + bakiye);
            }
        }
    }
    public void bakiyeogren () {
        System.out.println("Bakiye = " + bakiye);
    }
}
