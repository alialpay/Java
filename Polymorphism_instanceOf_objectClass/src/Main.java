class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus() { // metod
        return "Hayvan konuşuyor...";
    }
}
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }
}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
    
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
    
}

public class Main {
    public static void konustur(Object object){
        //System.out.println(hayvan.konus());
        
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        }
        else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }
    public static void main(String[] args) {
       
        //instanceof
        /*Kopek kopek = new Kopek("Karabaş");
        
        if(kopek instanceof Kopek) {
            System.out.println("kopek Kopek sınıfına mı ait? evet");*/
        
        Kopek kopek = new Kopek("Karabaş");
        Kedi kedi = new Kedi ("Tekir");
        At at = new At("Şahbatur");
        Hayvan hayvan = new Hayvan ("Limon");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        
        
        }
    }

