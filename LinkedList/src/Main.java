
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    
    public static void listeyibastir(LinkedList<String> gidilecekyerler){
        
       /* for(String s: gidilecekyerler){
            System.out.println(s);
        }*/
      
        ListIterator<String> iterator = gidilecekyerler.listIterator();
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
            
        }
    }
    public static void siraliekle(LinkedList<String> gidilecekyerler,String yeni){
         ListIterator<String> iterator = gidilecekyerler.listIterator();
         
         while (iterator.hasNext()) {            
            int karsilastir = iterator.next().compareTo(yeni);
            
             if (karsilastir == 0) {
                 //iki deger esit
                 System.out.println("Listenizde bu eleman zaten var...");
                 
                 return;
             }
             else if (karsilastir < 0) {
                 //yeni deger iterator.next ten daha büyük
                 
             }
             else if (karsilastir > 0) {
                 
                 iterator.previous();
                 iterator.add(yeni);
                 
                 return;
             }
        }
         iterator.add(yeni);

    }
    public static void main(String[] args) {
        LinkedList<String> gidilecekyerler = new LinkedList<String>();
        
        siraliekle(gidilecekyerler, "Postane");
        siraliekle(gidilecekyerler, "Market");
        siraliekle(gidilecekyerler, "Ev");
        
       /* gidilecekyerler.add("Postane");
        gidilecekyerler.add("Market");
        gidilecekyerler.add("Okul");
        gidilecekyerler.add("Kütüphane");
        gidilecekyerler.add("Spor Salonu");
        gidilecekyerler.add("Ev");
        
        listeyibastir(gidilecekyerler);
        
        System.out.println("-------------------------------------");
        
        // gidilecekyerler.add(4,"Alışveriş Merkezi");
        gidilecekyerler.remove(3);
        
        listeyibastir(gidilecekyerler);
        */
       
        listeyibastir(gidilecekyerler);
        
    }
}
