
public class Daire extends Sekil{
    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    public void alanHesabı() {
        System.out.println(getIsim()+"'nin alanı : " + Math.PI*yaricap*yaricap);
    }
    
}
