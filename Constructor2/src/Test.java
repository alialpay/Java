
public class Test {
    public static void main(String[] args) {
      
        Account account1 = new Account();
        
        //System.out.println(account1.getEmail());
        
        Account account2 = new Account ("Ali","alialpay96@hotmail.com", "4896815");
        
        //System.out.println(account2.getEmail());
        //System.out.println(account2.getBakiye());
        //bir varsayılan bakiye değeri bir de kendi belirlerdiğimiz email değerini yazdırdık
        
        account2.bilgilerigoster();
    }
}
