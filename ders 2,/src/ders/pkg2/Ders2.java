/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders.pkg2;

import java.util.Scanner;

/**
 *
 * @author mustafayigitguzel
 */
public class Ders2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = keyboardScanner.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = keyboardScanner.nextLine();  
        
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        
        String pigLatinFirstName = firstName.substring(1) + firstName.substring(0, 1);
        String pigLatinLastName = lastName.substring(1) + lastName.substring(0,1);
        pigLatinFirstName = pigLatinFirstName.substring(0, 1).toUpperCase() + pigLatinFirstName.substring(1);
        pigLatinLastName = pigLatinLastName.substring(0, 1).toUpperCase() + pigLatinLastName.substring(1);
        
        System.out.println(firstName+" "+lastName);
        System.out.println("Pig Latin: "+pigLatinFirstName+" "+pigLatinLastName);
    }
    
}
