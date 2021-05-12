
public class Dragon extends Beyblade{
    
    private String kutsalcanavar;
    private String gizliyetenek;

    public Dragon(String kutsalcanavar, String gizliyetenek, String beybladeci, int donushizi, int saldirigucu) {
        super(beybladeci, donushizi, saldirigucu);
        this.kutsalcanavar = kutsalcanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        
        System.out.println("Kutsal Canavar Adı : " + kutsalcanavar);
        System.out.println("Gizli Yetenek : " + gizliyetenek);
    }

    @Override
    public void kutlsalcanavarortayacikar() {
        super.kutlsalcanavarortayacikar(); 
        
        System.out.println(getBeybladeci() + " " + kutsalcanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın Saldırısı : Hayalet Kasırgası");
    }
    
    
    
}
