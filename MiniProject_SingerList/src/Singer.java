
import java.util.ArrayList;


public class Singer {
    private ArrayList<String> sarkicilistesi = new ArrayList<String>();
    
    
    public void sarkicilaribastir(){
        System.out.println("Şarkıcı Listesinde "+ sarkicilistesi.size() + " kadar şarkıcı var.");
        System.out.println("Şarkıcılar");
        for(int i =0; i<sarkicilistesi.size(); i++){
            
            System.out.println("________________");
            System.out.println((i+1) + ".Şarkıcı: " + sarkicilistesi.get(i));
        }
        
    }
   public void sarkiciekle (String isim){
       sarkicilistesi.add(isim);
       System.out.println("Şarkıcı Listesi Güncellendi...");
   }
   public void sarkiciguncelle(String yeniisim , int pozisyon){
       
       sarkicilistesi.set(pozisyon, yeniisim);
       System.out.println("Şarkıcı Listei Güncellendi...");
   }
    
    public void sarkicisil(int pozisyon){
        String isim = sarkicilistesi.get(pozisyon);
        
        sarkicilistesi.remove(pozisyon);
        System.out.println(isim +" isimli şarkıcı listeden silindi...");
    }
    
    public void sarkiciara(String sarkiciismi){
        int pozisyon = sarkicilistesi.indexOf(sarkiciismi);
        
        if (pozisyon >= 0) {
            System.out.println("Şarkıcı Bulundu.");
            System.out.println(sarkiciismi + " isimli şarkıcı " + (pozisyon+1) + ". pozisyonda.");
        }
        else{
            System.out.println("Şarkıcı Bulunamadı...");
        }
    }
}
