
package patika.dev;

import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KDV'siz Fiyat: ");
        double tutar = input.nextDouble();
        
        if(tutar <= 1000 && tutar > 0){
            System.out.println("KDV'li Fiyat: " + String.format("%.2f", (tutar * (1.18))));
            System.out.println("KDV tutarı: " + String.format("%.2f", (tutar * (0.18))));            
        }
        else if(tutar > 1000){
            System.out.println("KDV'li Fiyat: " + String.format("%.2f", (tutar * (1.08))));
            System.out.println("KDV tutarı: " + String.format("%.2f", (tutar * (0.08))));            
        }
    }
}
