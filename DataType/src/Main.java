
public class Main {
    public static void main(String[] args) {
        int a = 4; 
        System.out.println("int veri tipinin kaplayacağı max alan:" + Integer.MAX_VALUE);
        System.out.println("min:" + Integer.MIN_VALUE);
        
        byte b = 100;
         System.out.println("byte veri tipinin kaplayacağı max alana:" + Byte.MAX_VALUE);
         System.out.println("min:" + Byte.MIN_VALUE);
         
         System.out.println("short veri tipinini kaplayacağı max alan:" + Short.MAX_VALUE);
         System.out.println("min:" + Short.MIN_VALUE);
         System.out.println("long veri tipinin kaplayacağı max alan:" + Long.MAX_VALUE);
                System.out.println("min:" + Long.MIN_VALUE);
                
                
                //byte --> short --> int --> long
                short j = 1000;
                int i = (j / 2);
              
                System.out.println("karmaşa:" + i);
                
                byte c = 100;
                byte v = (byte) (c / 2);
                System.out.println("byte cinsinden yap dedik:" + v);
                   short p = 100;
                   byte n = 2 ;
                   int ı = 4;
                   long o = p + n + ı;
                System.out.println("farklı veri tipleri toplamı:" + o );  
                  
   
    }
}
