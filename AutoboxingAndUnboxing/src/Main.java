
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       ArrayList<String> arrayList = new ArrayList<String>();
       
       ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
       
       
      /* for(int i = 0; i < 10; i++){
           arrayList2.add(Integer.valueOf(i*4)); //Autoboxing
       }
       for(int i = 0; i < arrayList2.size(); i++){
           System.out.println(arrayList2.get(i).intValue()); //Unboxing
       }*/
      
      for(int i = 0; i < 10; i++){
           arrayList2.add(i*4); 
       }
       for(int i = 0; i < arrayList2.size(); i++){
           System.out.println(arrayList2.get(i)); //Unboxing arraylist2.get().intValue()
       }
       
    }
}
