
import java.util.Scanner;


public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int bakiye = 1453;
          System.out.println("Yapmak istedğiniz işlemi seçiniz...\n ");
             String islemler =  " 1.işlem : Bakiye Öğrenme \n"
                           + " 2.işlem : Para Çekme \n"
                           + " 3.işlem : Para Yatırma \n"
                           + " Çıkış   : q'a basınız"; 
          System.out.println("***************************************"); 
          System.out.println(islemler);
          System.out.println("***************************************");
          while (true) {              
              System.out.println("işlemi seçiniz...");
              String islem = scanner.nextLine();
              
              
              if (islem.equals("q")) {
                  System.out.println("Programdan çıkılıyor...");
                  break;
              }
              else if (islem.equals("1")){
                  System.out.println("Bakiyeniz : " + bakiye);
              }
              else if (islem.equals("2")){
                  System.out.println("Çekmek İstediğiniz Tutar : ");
                  int tutar = scanner.nextInt();
                  scanner.nextLine();
                  if( bakiye - tutar < 0 ) {
                      System.out.println("Yeterli bakiyeniz bulunmamaktadır.\n Bakiyeniz : " + bakiye);
                  } 
                  else {
                      bakiye -= tutar;
                      System.out.println("Yeni Bakiyeniz : " + bakiye);
                  }
              }
              else if (islem.equals("3")){
                  System.out.println("yatırmak istediğiniz tutar : ");
                  int tutar = scanner.nextInt();
                  scanner.nextLine();
                  bakiye += tutar ;
                  System.out.println("Yeni Bakiyeniz : " + bakiye);
                  
                  
              }
              else {
                  System.out.println("Geçersiz işlem...");
              }
          }
    }
}
