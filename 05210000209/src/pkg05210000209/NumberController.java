package pkg05210000209;

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberController {
    private int [] sayılar = new int[20];
    public NumberController(String a) throws FileNotFoundException {
        dosyaOkuma(a);
        Sıralama();
    }
    public void dosyaOkuma(String a) throws FileNotFoundException {
        File dosya = new File(a);
        Scanner scanner = new Scanner(dosya);
        int i = 0;
        while (scanner.hasNextInt() && i < 20) {
            sayılar[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
    }
    
    
    public void arrayi_yazdır() {
        for(int i = 0; i < sayılar.length; i++) {
            System.out.println("Listenin " + (i+1) +". elemanı: " + sayılar[i]);
        }
    }
    public void Sıralama() {
    int n = sayılar.length;
    int temp = 0;
 
    for(int i=0; i < n; i++){
        for(int j=1; j < (n-i); j++){
            if(sayılar[j-1] < sayılar[j]){
            //elemanları yerdeğiştiriyoruz.
                temp = sayılar[j-1];
                sayılar[j-1] = sayılar[j];
                sayılar[j] = temp;
                }        
 
            }
        }
    }
    public boolean binarySearch(int sayı) { 
        int l = 0, r = (sayılar.length - 1); 
        while (l <= r) { 
            int m = (l + r) / 2; 
  
            //x değeri ortanca değer mi kontrol et
            if (sayılar[m] == sayı) {
                return true; 
            }
            // x ortanca değerden büyükse, sol yarıyı görmezden gelir
            else if (sayılar[m] < sayı) {
                l = m + 1; 
            }
            // x ortanca değerden küçükse, sağ yarıyı görmezden gelir
            else {
                r = m - 1; 
        }
        }
  
        // x değeri dizide bulunamadıysa -1 değerini döner
        return false; 
    } 
    public boolean searchSequential(int sayı) {
        for (int i = 0; i < 20; i++) {
            if (sayılar[i] == sayı) {
                return true;
            }
        }
        return false;
    }
}
