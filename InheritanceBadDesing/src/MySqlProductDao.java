
public class MySqlProductDao {
    private String connectionString;

    public MySqlProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
    public void add(Product product){
        System.out.println("MySql Database " + product.getName() + " eklendi.");
    }
}
