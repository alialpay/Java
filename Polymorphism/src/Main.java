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
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
       /* Hayvan hayvan1 = new Kedi("Tekir");
        System.out.println(hayvan1.konus());
        
        Hayvan hayvan2 = new Kopek("Karabaş");
        System.out.println(hayvan2.konus());
        
        Hayvan hayvan3 = new At("Şahbatur");
        System.out.println(hayvan3.konus());
    }*/
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Şahbatur"));
        
        //instanceof
        Kopek kopek = new Kopek("Karabaş");
        
        if(kopek instanceof Kopek/*Hayvan*/) {
            System.out.println("kopek Kopek sınıfına mı ait? evet");
        }
    }
}
