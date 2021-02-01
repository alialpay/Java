
public class Test {
    public static void main(String[] args) {
        
        //Account account1 = new Account();
        
        Account account2 = new Account("123123", 1000.0, "Ali", "alialpay@mochka.com", "5073340996" );
        
        account2.paraYatır(500);
        account2.paraCekme(2000);
        System.out.println("Email= " + account2.getEmail());
               
    }
}
