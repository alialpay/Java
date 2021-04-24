
public class Main {
   
 /* public static void toplama(String a , String b ) {
        
        System.out.println(a + " " + b);    
    }
    public static void toplama(int a , int b ) {
        
        System.out.println("toplamları : " + (a+b));
    }
    
     public static void toplama(int a , int b , int c) {
        
        System.out.println("toplamları : " + (a+b+c));
    }
    
    */
    public static void scorhesapla(String isim , int puan) {
        
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }
    public static void scorhesapla(int puan) {
        
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }
    public static void scorhesapla(String isim) {
        
        System.out.println(isim + " adlı oyuncunun panı hesaplanamadı.");
    }
    public static void main(String[] args) {
    /*  toplama(3, 4);
        toplama(3, 4, 5);
        toplama("Ali", "Alpay");
    */    
    
        scorhesapla("Handan");
        scorhesapla(35);
        scorhesapla("Ali", 50);
    }
    }

