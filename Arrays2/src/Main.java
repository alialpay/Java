
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int[] arrayidoldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        
        int[] cikti = new int[sayi];
        
        for ( int i = 0; i< sayi ; i++){
            cikti[i] = scanner.nextInt();
            
        }
        return cikti;  
    }

    public static void arrayibastir(int[] array) {
        
        for ( int i = 0; i< array.length ; i++){
            System.out.println("Element " + ( i+1) + ": " + array[i]);
        }
    }    
    public static void arraysort(int [] array){
        //Arrays Sınıfı
        Arrays.sort(array);
        arrayibastir(array);
        
    }
    public static void main(String[] args) {
        
       // int[] a = arrayidoldur(5);
       // arrayibastir(a);
        
       // arraysort(a);
        
        int[]a1={1,2,3,4,5,6};
        int[]a2={1,2,3,4,5,6};
        
        /*if(a1==a2){
            System.out.println("eşitler");
        }
        else{
            System.out.println("eşit değiller");  // sonuç gösteriyor ki a1 ve
                                                  // a2 değerleri aynı olsa bile 
        }                                         // bellekte aynı yeri göstermiyorlar
        */
        if(Arrays.equals(a1, a2)){  // arrays sınıfında equals metodu var.
            System.out.println("eşitler");
        }
        else{
            System.out.println("eşit değiller");  // burda ise değerleri karşılaştırdık
    }   
}
}