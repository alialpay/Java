
public class Yonetici extends Calisan { // SubClass yani alt sınıf
    
    private int sorumlukisi; //ekstra 
    
    public Yonetici(String isim, int maas, String departman,int sorumlukisi) {
      /*  this.isim = isim;
        this.maas = maas;
        this.departman = departman; */
      
      super(isim,maas,departman);
      
      this.sorumlukisi = sorumlukisi;
     
    }
    public void zamyap(int zammiktari) {
        
        System.out.println("Çalışanlara " + zammiktari + " tl zam yapıldı");
    }
    
     public void bilgilerigoster() {
        
       /* System.out.println("İsim : "+ getIsim());
        System.out.println("Maaş : " + getMaas());
        System.out.println("Departman : "  + getDepartman()); */
        
       super.bilgilerigoster();
         System.out.println("Sorumlu kişi sayısı: " + sorumlukisi ); 
     }
}
