
package desenegoremetotolusturma;
import java.util.*;
public class DeseneGoreMetotOlusturma {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
                
        while(true){
           System.out.print("Bir sayı giriniz:");
           sayi = input.nextInt();
        
           System.out.print("Çıktı:");
           metotOlusturma(sayi);
           
           System.out.println();
        }
        
   
    }
    
    static void metotOlusturma(int sayi){
      if(sayi<=0){
          System.out.print(" " + sayi);
          return;
      }
      System.out.print(" " +sayi);
        metotOlusturma(sayi - 5);
        System.out.print(" " + sayi);
      
    }
}
