
public class Daire extends Sekil{
    
    private int yaricap;

    public Daire(String isim , int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanhesapla() {
        System.out.println(getIsim() + " alanı " + (Math.PI*yaricap*yaricap) + " dir.");
    }
    
}
