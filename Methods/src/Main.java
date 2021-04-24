
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alial
 */
public class Main {
    public static void selamlama(String isim) {
        
        System.out.println("selamlar " + isim);
        
    }
   
    public static void toplama(int a, int b, int c) {
        
        System.out.println("toplamları : " + (a+b+c));
        
    }
    
    public static void faktöriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("bis sayı giriniz");
        int sayi = scanner.nextInt();
        
        int faktöriyel = 1 ;
        
        while(sayi > 0) {
            
            faktöriyel *= sayi;
            sayi--;
            
            
        }
        System.out.println("Faktöriyel : " + faktöriyel );
    }
    
    public static void main(String[] args) {
        
        selamlama("Handan");
        
                selamlama("Ali");
                
                faktöriyel();
                
                toplama(3, 4, 8);

    }
}
