
public class GelismisAbone {
     private String aboneisim;
     private int bakiye = 120;
     
     private String sehir;
     
     public GelismisAbone(String isim, int bakiye, String sehir){
         
         this.aboneisim=isim;
         
         if (bakiye >00 && bakiye <=120) {
             
             this.bakiye = bakiye;
         }
         this.sehir = sehir;
         
     }
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
