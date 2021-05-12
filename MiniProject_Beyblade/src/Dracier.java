
public class Dracier extends Beyblade{
    
    private String kutsalcanavar;

    public Dracier(String kutsalcanavar, String beybladeci, int donushizi, int saldirigucu) {
        super(beybladeci, donushizi, saldirigucu);
        this.kutsalcanavar = kutsalcanavar;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        
        System.out.println("Kutsal Canavar Adı : " + kutsalcanavar);
    }

    @Override
    public void kutlsalcanavarortayacikar() {
        super.kutlsalcanavarortayacikar(); 
        
        System.out.println(getBeybladeci() + " " + kutsalcanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın Savunması : Kale Savunması");
    }
    
    
    
}
