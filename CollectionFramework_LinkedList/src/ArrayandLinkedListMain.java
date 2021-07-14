
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayandLinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        zamanhesapla("LinkedList", linkedlist);
        zamanhesapla("ArrayList", arraylist);
 
    }
    public static void zamanhesapla(String veri_tipi, List<Integer> list){
        
        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;
        
        baslangic = System.currentTimeMillis();
        
        for(int i =0; i < 1000000 ; i++){
            list.add(0,i);
        }
        bitis = System.currentTimeMillis();
        
        System.out.println(veri_tipi + " ekleme süresi " + (bitis-baslangic) + " ms");
        
        
    }
    
}
