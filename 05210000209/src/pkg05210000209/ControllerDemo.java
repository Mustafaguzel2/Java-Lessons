package pkg05210000209;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControllerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        NumberController test = new NumberController("Metin.txt");
        Scanner scanner = new Scanner(System.in);
        
        test.arrayi_yazdır();

        // Kullanıcıdan 1. tamsayıyı girmesini isteyin.
        System.out.print("Lütfen bir tamsayı girin: ");
        int sayı1 = scanner.nextInt();

        // searchBinary metodu ile sayıyı arayın.
        boolean isListedeVarsa1 = test.binarySearch(sayı1);
        if (isListedeVarsa1) {
            System.out.println(sayı1 + " sayısı dizide bulundu (Binary Search).");
        } else {
            System.out.println(sayı1 + " sayısı dizide bulunamadı (Binary Search).");
        }

        // Kullanıcıdan 2. tamsayıyı girmesini isteyin.
        System.out.print("Lütfen başka bir tamsayı girin: ");
        int sayı2 = scanner.nextInt();

        // searchSequential metodu ile sayıyı arayın.
        boolean isListedeVarsa2 = test.searchSequential(sayı2);
        if (isListedeVarsa2) {
            System.out.println(sayı2 + " sayısı dizide bulundu (Sequential Search).");
        } else {
            System.out.println(sayı2 + " sayısı dizide bulunamadı (Sequential Search).");
        }
    }
}
