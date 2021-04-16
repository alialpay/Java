
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        System.out.println("YGS LYS Birinci Bulma Programı");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                + "1. Eşit Ağırlık Öğrencileri Birincisi\n"
                + "2. Sayısal Öğrencileri Birincisi";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");
        
        
        while (true) {     
            System.out.println("Çıkış için 'q'ya basın");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
                 //Birinci Öğrenci
                System.out.print("Birinci Öğrenci İsmi: " );
                String isim1 = scanner.nextLine();
                System.out.print("Netler(Türkçe Matematik Edebiyat Fizik) : ");
                int turkce1 = scanner.nextInt();
                int matematik1 = scanner.nextInt();
                int edebiyat1 = scanner.nextInt();
                int fizik1 = scanner.nextInt();
                scanner.nextLine();
                
                //İkinci Öğrenci
                System.out.print("İkinci Öğrenci İsmi: " );
                String isim2 = scanner.nextLine();
                System.out.print("Netler(Türkçe Matematik Edebiyat Fizik) : ");
                int turkce2 = scanner.nextInt();
                int matematik2 = scanner.nextInt();
                int edebiyat2 = scanner.nextInt();
                int fizik2 = scanner.nextInt();
                scanner.nextLine();
                
                //Üçüncü Öğrenci
                System.out.print("Üçüncü Öğrenci İsmi: " );
                String isim3 = scanner.nextLine();
                System.out.print("Netler(Türkçe Matematik Edebiyat Fizik) : ");
                int turkce3 = scanner.nextInt();
                int matematik3 = scanner.nextInt();
                int edebiyat3 = scanner.nextInt();
                int fizik3 = scanner.nextInt();
                scanner.nextLine();
                
                
            System.out.print("İşlemi Giriniz: ");
            String islem = scanner.nextLine();
            
            
            if (islem.equals("1")) {
                Esitagirlik ogrenci1 = new Esitagirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Esitagirlik ogrenci2 = new Esitagirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Esitagirlik ogrenci3 = new Esitagirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Esitagirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci Öğrenci : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());
                
            }
            else if (islem.equals("2")) {
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci Öğrenci : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());

            }
            else {
                System.out.println("Geçersiz işlem girdiniz!");
            }
        }
    }
    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        if(e1.puanHesapla()>e2.puanHesapla()&&e1.puanHesapla()>e3.puanHesapla()){
           return e1;
        }
        else if(e2.puanHesapla()>e1.puanHesapla()&&e2.puanHesapla()>e3.puanHesapla()){
           return e2;
        }
        else if(e3.puanHesapla()>e2.puanHesapla()&&e3.puanHesapla()>e1.puanHesapla()){
           return e3;
        }
        else {
            return e1;
        }
    }
       
}
