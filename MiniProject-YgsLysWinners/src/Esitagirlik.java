
public class Esitagirlik extends Aday{

    public Esitagirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puanHesapla() {
        
        return getTurkce()*5 + getMatematik()*5 + getFizik()*1 + getEdebiyat()*4;

    }
    
}
