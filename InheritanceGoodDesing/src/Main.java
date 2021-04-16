
public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new MySqlProductDao("Mysql String"));
        productManager.add(new Product(2, "çikolata",5));
    }
}
// Spring IOC Container