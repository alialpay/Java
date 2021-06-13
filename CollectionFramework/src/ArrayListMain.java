
import java.util.*;


public class ArrayListMain {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        //Eleman ekleme
        list.add("java");
        list.add("c#");
        list.add("c++");
        
       // Elemana erişme
       // System.out.println(list.get(0));
       // System.out.println(list.get(1));
       // System.out.println(list.get(2));
       // System.out.println(list.get(3)); // Hata verir
       
        System.out.println("******************");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("*******************");
        
        //for each
        
        for(String s: list) {
            System.out.println(s);
        }
         System.out.println("*******************");
        
        list.remove("java");
        for(String s: list) {
            System.out.println(s);
        }
    }
}
