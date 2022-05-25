
package patika.dev;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        
        System.out.println("Matematik notunuz: ");
        Matematik = input.nextInt();
        
        System.out.println("Fizik notunuz: ");
        Fizik = input.nextInt();
        
        System.out.println("Kimya notunuz: ");
        Kimya = input.nextInt();
        
        System.out.println("Türkçe notunuz: ");
        Türkçe = input.nextInt();
        
        System.out.println("Tarih notunuz: ");
        Tarih = input.nextInt();
        
        System.out.println("Müzik notunuz: ");
        Müzik = input.nextInt();
        
        int toplamPuan = Matematik + Fizik + Kimya + Türkçe + Tarih + Müzik;
        double ortalama = toplamPuan / 6.0;
        System.out.println("Ortalamanız: " + ortalama);
        
        int sonuç = (int)ortalama / 60;
        
        switch(sonuç){
            case 0: System.out.println("Sınıfta Kaldı");
            break;
            
            case 1: System.out.println("Sınıfı Geçti");
            break;     
        }
        
        
    }
    
}
