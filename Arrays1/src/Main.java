
import java.util.Scanner;


public class Main {
    public static void arrayibastir(int [] array){
            
            for(int i = 0; i < array.length; i++){
                System.out.println("Element " + (i+1) + ":" + array[i]);
            }
        }
    public static double ort(int[] array){
        int top = 0;
        for(int i = 0; i < array.length; i++){
            top += array[i];
        }
        return ((double)top / array.length);
        
    }
    public static void main(String[] args) {
        
     /*   int[] a = {30, 40, 50, 60, 70};
        
        System.out.println(a[4]); */
     
     int [] a = new int[5];
     int [] b = {5,9,80,4,6};
        //System.out.println("Dizimizin uzunluğu : " + b.length);
     
        arrayibastir(b);
        System.out.println("Ortalama:" + ort(b));
     
     /*for (int i = 0 ; i<5 ; i++){
         a[i] = i*4+2;
     }*/
     
    /* Scanner scanner = new Scanner(System.in);
     for ( int i =0 ; i<5 ; i++){
         a[i] = scanner.nextInt();
         
     }
        System.out.println("********************************");
        System.out.println("********************************");
     for (int i = 0; i<5 ; i++) {
         System.out.println(a[i]);
     }
        System.out.println("********************************"); */
    }
    
}
