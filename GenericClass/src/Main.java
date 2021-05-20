
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] String_dizi = {"Java","Python","C++","Php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Ali"),new Ogrenci("Selin"),new Ogrenci("Merve")};
       
        YazırmaSınıfı<Character> yazdir_char = new YazırmaSınıfı<>();
        YazırmaSınıfı<String> yazdir_string = new YazırmaSınıfı<String>();
        YazırmaSınıfı<Integer> yazdir_int = new YazırmaSınıfı<Integer>();
        YazırmaSınıfı<Ogrenci> yazdir_ogrenci = new YazırmaSınıfı<Ogrenci>();
        
        yazdir_char.yazdir(char_dizi);
        System.out.println("*********************");
        yazdir_string.yazdir(String_dizi);
        System.out.println("*********************");
        yazdir_int.yazdir(integer_dizi);
        System.out.println("*********************");
        yazdir_ogrenci.yazdir(ogrenci_dizi);

    }
  
}
