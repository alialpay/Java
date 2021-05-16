
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void islemleribastir(){
        System.out.println("0 - İşlemleri Görüntüle...");
        System.out.println("1 - Bir sonraki şehre git...");
        System.out.println("2 - Bir önceki şehre git...");
        System.out.println("3 - Uygulamadan Çık");

        
    }
    public static void sehirleriturla(LinkedList<String> sehirler){
        ListIterator<String> iterator= sehirler.listIterator();
        
        int islem;
        
        islemleribastir();
        
        Scanner scanner = new Scanner(System.in);
        
        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }
        boolean cikis = false;
        
        while (!cikis) {
        
        System.out.print("Bir işlem seçin : ");
        
        islem = scanner.nextInt();
        
        scanner.nextLine();
        
        switch(islem) {
            case 0:
                islemleribastir();
                break;
            case 1:
                if (iterator.hasNext()) {
                    
                    System.out.println("Şehre gidiliyor : " + iterator.next());
                }
                else{
                    System.out.println("Girilecek şehir kalmadı...");
                }
                break;
            case 2:
                if (iterator.hasPrevious()) {
                    System.out.println("Şehre gidiliyor..." + iterator.previous());
                }
                else{
                    System.out.println("Şehir turu başladı...");
                }
                break;
            case 3:
                cikis = true;
                System.out.println("Uygulamadan çıkılıyor...");
                break;
        }
        
    }
    }
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Eskişehir");
        
        sehirleriturla(sehirler);
    }
}
