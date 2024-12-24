/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders4;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author mustafayigitguzel
 */
public class Ders4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name: ");
        String inputString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double hourlyPayRate = Double.parseDouble(inputString);
        inputString = JOptionPane.showInputDialog("Enter hours worked: ");
        double hours = Double.parseDouble(inputString);
        
        double payment = hourlyPayRate * hours;
        
        JOptionPane.showMessageDialog(null, "Hello "+name+" your payment is "+payment+"");
        
    }
    
}
