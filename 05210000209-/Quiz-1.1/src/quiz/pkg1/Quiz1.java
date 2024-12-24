package quiz.pkg1;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        Scanner scanner = new Scanner(System.in);
        //Toplam kazançları belirlemek için değişken oluşturuldu.
        double toplamHarcama = 0;
        double toplamKazanma = 0;
        boolean oyunaDevam = true;
        
        while(oyunaDevam) {
            //Kullanıcıdan para miktarı alınıyor.
            System.out.println("Oyunu oynamak için kaç para yüklemek istediğinizi giriniz: ");
            double yatırılanPara = scanner.nextDouble();
            toplamHarcama += yatırılanPara;
            
            //Meyve seçimi
            String[] meyveler = {"Çilek", "Portakal", "Elma", "Muz", "Kiraz", "Kavun"};
            String meyve1 = meyveler[rastgele.nextInt(6)];
            String meyve2 = meyveler[rastgele.nextInt(6)];
            String meyve3 = meyveler[rastgele.nextInt(6)];
            
            //Oyuncunun hangi kelimeleri seçtiği gösterilir.
            System.out.println("Çıkan 1. meyve: " + meyve1);
            System.out.println("Çıkan 2. meyve: " + meyve2);
            System.out.println("Çıkan 3. meyve: " + meyve3);
            
            //Kazanılan bir ödül varsa ekrana yazdırılır.
            if(meyve1.equals(meyve2) && meyve2.equals(meyve3)) {
                double ödül = yatırılanPara * 3;
                System.out.println("Tebrikler, üç tane " + meyve1 + " tutturdunuz !!!");
                System.out.println(ödül + "Tl para kazandınız.");
                toplamKazanma += ödül;
            }
            else if(meyve1.equals(meyve2) || meyve1.equals(meyve3) || meyve2.equals(meyve3)) {
                double ödül = yatırılanPara * 2;
                System.out.println("Tebrikler, iki tane " + meyve1 + " tutturdunuz !!!");
                System.out.println(ödül + "Tl para kazandınız.");
                toplamKazanma += ödül;
            }
            else {
                
                System.out.println("Maalesef hiçbir ödül alamadınız.");
            }
            
            System.out.println("Tekrar oynamak ister misiniz ?(y/n): ");
            scanner.nextLine();
            String tekrarOynama = scanner.nextLine();
            if (tekrarOynama.equalsIgnoreCase("n")) {
                oyunaDevam = false;
            }
        }
        double kar = toplamKazanma - toplamHarcama;
        System.out.println("Toplam kazandığınız ödül: " + toplamKazanma + "Tl");
        System.out.println("Toplam harcadığınız para: " + toplamHarcama + "Tl");
        System.out.println("Karınız: " + kar + "Tl");
    }
    
}
