
public class Main {
    public static void main(String[] args) {
        
        String a = "Ali";
        
        String b = new String("Alialpay");
        
        System.out.println(b);
        
        System.out.println("Harf Sayısı: " +b.length());
        
        System.out.println("0.İndex: " + b.charAt(0));
        System.out.println("1.İndex: " + b.charAt(1));
        System.out.println("Son İndex: " + b.charAt(b.length()-1));
        
        System.out.println("");
        
        for(int i =0; i<b.length(); i++){
            
            System.out.println(b.charAt(i));
        }
        
        System.out.println("");
        
        System.out.println(b.startsWith("Al"));
        System.out.println(b.startsWith("Ai"));
        
        System.out.println(b.endsWith("ay"));
        
        System.out.println("");
        
        System.out.println(b.indexOf('i'));
        System.out.println(b.indexOf('b'));
        
        System.out.println(b.lastIndexOf('a'));
        
        System.out.println("");
        
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        String c = "1453";
        
        int d = Integer.parseInt(c);
        
        System.out.println(d-53);
        
        System.out.println("");
        
        int e =1453;
        
        String f = String.valueOf(e);
        
        System.out.println(f);      
        
        System.out.println("");
        System.out.println("");
        
        String a1 ="Ali";
        String a2="Ali";
        
        if (a1 == a2) {
            System.out.println("eşitler");
        }
        
        System.out.println("");
        
        String b1 = new String("Ali");
        String b2 = new String("Ali");
        
        if (b1 == b2) {
            System.out.println("eşitler");
        }
        else{
            System.out.println("eşit değiller");
        }
        
        if(b1.equals(b2)){
            System.out.println("eşitler");
        }
        
    }
}
