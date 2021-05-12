
public class BeybladeFabrikası {
    public Beyblade beybladeuret(String beybladeturu) {
        
        if (beybladeturu.equals("Dragon")) {
            return new Dragon("Mavi Ejderha", "Kutsal Canavarla Konuşma", "Takao", 800, 300);
        }
        else if (beybladeturu.equals("Dranza")) {
            return new Dranza("Kırmızı Anka Kuşu", "Kai", 600, 400);
        }
        else if (beybladeturu.equals("Drayga")) {
            return new Drayga("Beyaz Kaplan", "Rai", 800, 250);
        }
        else if (beybladeturu.equals("Dracier")) {
            return new Dracier("Kara Kaplumbağa", "Max", 400, 1000);
        }
        else {
            return null;
        }
        
        
    }
}
