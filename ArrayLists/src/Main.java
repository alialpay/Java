
import java.util.ArrayList;


public class Main {
    public static void yazdir(ArrayList<String> a){
        for(int i =0; i<a.size(); i++){
        System.out.println("Element " + (i+1) + ": " + a.get(i));
    }
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("Metallica");
        arrayList.add("Ayna");
        arrayList.add("Iron Maidon");
        arrayList.add("Black Sabbath");
        arrayList.add("Metallica");
        
        
         //arrayList.remove("Ayna");
         arrayList.set(4, "Megadeth");
         arrayList.remove(1);
        
        System.out.println(arrayList.get(0));
        System.out.println("size:" + arrayList.size());
        System.out.println("");
        System.out.println("");
        for(int i =0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        
        System.out.println("");
        
        System.out.println(arrayList.indexOf("Metallica"));
        System.out.println(arrayList.lastIndexOf("Metallica"));
        
        System.out.println("");
        
        
        yazdir(arrayList);
        
    }
    
}
