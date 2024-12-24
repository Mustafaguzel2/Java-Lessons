/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders3;
import javax.swing.JOptionPane;
/**
 *
 * @author mustafayigitguzel
 */
public class Ders3 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstname = JOptionPane.showInputDialog("Enter Firstname");
        String lastname = JOptionPane.showInputDialog("Enter Lirstname");
        JOptionPane.showMessageDialog(null, firstname+" "+lastname);
    }
    
}
