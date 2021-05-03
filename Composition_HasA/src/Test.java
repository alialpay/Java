
public class Test {
    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        
        Monitor monitor = new Monitor("vs197de", "asus", "18,5", resolution);
        
        Kasa kasa = new Kasa("shadowblade", "shadow", "temperli cam");
        
        Anakart anakart= new Anakart("Pro", "asus", 10, "Windows 10" );
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayariac();
        pc.getMonitor().monitorukapat();
        pc.getAnakart().isletimsistemiyukle("Ubuntu");
    }
}
