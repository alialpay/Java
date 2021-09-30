
public class Main {
    public static void main(String[] args) {
        /*
        try {
            Exception oluşturabilecek kodlar
        }
        catch {
            Exception durumunda yapılacak işlemler
        }
        */
        
        
      //  int a = 300 /0;
      //  System.out.println("Burası çalışıyor");
        
      //  int[] a = {1,2,3,4,5};
      //  System.out.println(a[6]);
      
        try {
            
            int b =  30/0;
            int[] a = {1,2,3,4,5};
            
            System.out.println(a[6]);
        
        }
       /* catch (ArithmeticException e) {
                System.out.println("Bir sayı sıfıra bölünemez");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin boyunu aştınız");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Bir hata oluştu");
        }*/
        finally{
            System.out.println("finaly bloğu çalışıyor");
        }
        System.out.println("burası çalışıyor");
        
    }
}
