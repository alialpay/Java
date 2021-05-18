
public class Ucgen extends Sekil{
    private int a;
    private int b;

    public Ucgen(String isim,int a, int b) {
        super(isim);
        this.a = a;
        this.b = b;
    }

    @Override
    public void alanHesabı() {
        System.out.println(getIsim()+" in alanı : " + a*b/2);
    }
    
  
}
