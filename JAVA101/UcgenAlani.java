
package patika.dev;

import java.util.Scanner;

public class UcgenAlani {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarı: ");
        int kenar1 = input.nextInt();
        
        System.out.println("Üçgenin ikinci kenarı: ");
        int kenar2 = input.nextInt();
        
        System.out.println("Üçgenin üçüncü kenarı: ");
        int kenar3 = input.nextInt();    
        
        double u = (kenar1 + kenar2 + kenar3) / 2d;
        
        System.out.println("Üçgen alanı: " + Math.sqrt( u * (u - kenar1) * (u - kenar2) * (u - kenar3)));
        
    }
}
