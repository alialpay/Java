
public class Bilgisayar {
    private Monitor monitor;
    private Kasa kasa ;
    private Anakart anakart;

    public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
}
