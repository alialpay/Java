
public class Main {
    public static void main(String[] args) {
        //+,.-,*,/,%(kalan) operatörleri
        
        System.out.println((3+4.2));
        System.out.println(3-5.0);
        System.out.println(10/4);
        System.out.println(10d/4);
        System.out.println(10/4d);
        System.out.println(3*4.5);
        System.out.println(10%4);
        
        int a = 4;
        a=a+2;
        System.out.println(a);
        int b =6;
        b=b*3;
        System.out.println(b);
        
        int x = 4;
        x +=2; //x=x+2
        System.out.println("\n" + x);
        
        x*=4;
        System.out.println(x);
        
        
        int y = 7;
        y--;
        System.out.println(y);
        
        int g = 9;
        int h = 9;
        System.out.println("g-- işlemi\t" + g--);  //g-- ve --h arasındaki farkı görebiliriz.
        System.out.println("--h işlemi\t" + --h);
        
        //işlem sırası
        
        System.out.println(3 + 4 * 5); //matematikteki aynı şekliyle geçerli. Tavsiye parantez kullan
    
    }
}
