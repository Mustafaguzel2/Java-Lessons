/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders5;
import java.util.Scanner;

/**
 *
 * @author mustafayigitguzel
 */
public class Ders5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int not,kod;
        do{
            System.out.println("Sayısal not değerinizi giriniz: ");
            not = giris.nextInt();
            if(not>= 90 && not <= 100){
                System.out.println("AA");
            }
            else if(not >= 80 && not <= 89){
                System.out.println("BA");
            }
            else if(not >= 70 && not <= 79){
                System.out.println("BB");
            }
            else if(not >= 60 && not <=69){
                System.out.println("CB");
            }
            else if(not >= 50 && not <= 59){
                System.out.println("CC");
            }
            else{
                    System.out.println("FF");
            }
            System.out.println("Çıkış için 0, devam etmek için herhangi bir rakam giriniz: ");
            kod = giris.nextInt();
        }
        while(kod != 0);
        System.exit(0);
    }
    
}
