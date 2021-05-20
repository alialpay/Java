
public class Test {
    public static void main(String[] args) {
        
       Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
       
       Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
       
       Sayisal birinci = birinci(sayisal1, sayisal2);
               
       Esitagirlik esitagirlik1 = new Esitagirlik(30, 20, 40, 2);
       Esitagirlik esitagirlik2 = new Esitagirlik(40, 10, 50, 0);
        
       Esitagirlik birinci2 = birinci(esitagirlik1,esitagirlik2);
        
     System.out.println("Brinci sayısal öğrencinin puanı: " + birinci.puanHesapla());
     System.out.println("Brinci eşitağırlık öğrencinin puanı: " + birinci2.puanHesapla());

        
       /* Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","Python","C++","Php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Ali"),new Ogrenci("Selin"),new Ogrenci("Merve")};
       
        
        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);
        
    }
    public static <E> void yazdir(E[] dizi){
        for(E e : dizi){
            System.out.println(e);
        }*/
    }
    public static <E extends Aday> E birinci(E e1, E e2 ) {
        if(e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }
        else{
            return e2;
        }
    }
       
}
