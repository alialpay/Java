
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
    
    int[] array1 = {1,2,3,4,5,6};  // tek boyut
    int[][] array2 =  new int[2][2];  // {{10,20},{30,40}}; // çok boyut
    
        System.out.println(array2[0][0]);
   /* array2[0][0] = 10;
    array2[0][1] = 20;
    array2[1][0] = 30;
    array2[1][1] = 40; */
    
        System.out.println(array2.length);
    
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 2 ; i++){
            
            for(int j = 0; j < 2; j++){
                
                array2[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < 2 ; i++){
            
            for(int j = 0; j < 2; j++){
                
                System.out.print(array2[i][j] + " ");
            }
            System.out.println("");
    }
}
}