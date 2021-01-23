
public class Main {
    public static void main(String[] args) {
        //char veri tipi : karakterşeri göstermek için kullanılır. 3 byte yer kaplar. 2^16 tane karakter simgelenebilir.
        //Boolean Veri Tipi : Koşul durumlarında kullanılır. True veya False değeri alır.
        
        char a = 'A';
        char b = '?';
        char c = 2000;
        char d = ('\u0409');
        char e = ('\u0684');
        
        // unicode table üzerinden karakter numaralarına bakıyoruz
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        //farklı simgeleri de karakter numaralarına göre javaya tanıttık.
        
        boolean x = true;
        boolean y = false;
        System.out.println(x);
        System.out.println(y);
        
    }
    
}
