
public class İdman {
    private int burpeesayısı;
    private int pushupssayısı;
    private int situpsayısı;
    private int squatsayısı;

    public İdman(int burpeesayısı, int pushupssayısı, int situpsayısı, int squatsayısı) {
        this.burpeesayısı = burpeesayısı;
        this.pushupssayısı = pushupssayısı;
        this.situpsayısı = situpsayısı;
        this.squatsayısı = squatsayısı;
    }

    public int getBurpeesayısı() {
        return burpeesayısı;
    }

    public void setBurpeesayısı(int burpeesayısı) {
        this.burpeesayısı = burpeesayısı;
    }

    public int getPushupssayısı() {
        return pushupssayısı;
    }

    public void setPushupssayısı(int pushupssayısı) {
        this.pushupssayısı = pushupssayısı;
    }

    public int getSitupsayısı() {
        return situpsayısı;
    }

    public void setSitupsayısı(int situpsayısı) {
        this.situpsayısı = situpsayısı;
    }

    public int getSquatsayısı() {
        return squatsayısı;
    }

    public void setSquatsayısı(int squatsayısı) {
        this.squatsayısı = squatsayısı;
    }
    
    public void hareketyap(String harekettürü,int sayı){
        if (harekettürü.equals("Burpee")) {
            burpeeyap(sayı);
        }
        else if (harekettürü.equals("Pushup")) {
            pushupyap(sayı);
        }
        else if (harekettürü.equals("Situp")) {
            situpyap(sayı);
        }
        else if (harekettürü.equals("Squat")) {
            squatyap(sayı);
        }
        else {
            System.out.println("Geçersiz Hareket!");
        }
       
    }
    public void burpeeyap(int sayı) {
        if (burpeesayısı == 0) {
            System.out.println("Yapacak Burpee Kalmadı...");
        }
        if (burpeesayısı-sayı<0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin. Tebrikler!");
        }
        else {
            burpeesayısı -= sayı;
            System.out.println("Kalan Burpee Sayısı : " + burpeesayısı);
        }
    }
    public void pushupyap(int sayı) {
        if (pushupssayısı==0) {
            System.out.println("Yapacak Pushup Kalmadı...");
        }
        if (pushupssayısı-sayı<0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin. Tebrikler!");
        }
        else {
            pushupssayısı -= sayı;
            System.out.println("Kalan Pushup Sayısı : " + pushupssayısı);
        }
    }
    public void situpyap(int sayı) {
        if (situpsayısı==0) {
            System.out.println("Yapacak Situp Kalmadı...");
        }
        if (situpsayısı-sayı<0) {
            System.out.println("Hedeflediğin situp sayısını geçtin. Tebrikler!");
        }
        else {
            situpsayısı -= sayı;
            System.out.println("Kalan Situp Sayısı : " + situpsayısı);
        }
    }
    public void squatyap(int sayı) {
        if (squatsayısı==0) {
            System.out.println("Yapacak Squat Kalmadı...");
        }
        if (squatsayısı-sayı<0) {
            System.out.println("Hedeflediğin squat sayısını geçtin. Tebrikler!");
        }
        else {
            squatsayısı -= sayı;
            System.out.println("Kalan Squat Sayısı : " + squatsayısı);
        }
    }
    public boolean idmanbittimi(){
        
        return (burpeesayısı==0) && (pushupssayısı==0)&& (situpsayısı==0)&& (squatsayısı==0);
    }
}
