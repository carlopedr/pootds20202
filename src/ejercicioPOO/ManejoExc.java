/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPOO;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ManejoExc {
    public static void main(String[] args) {
        int x;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número no es válido");
        }        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error indeterminado");
        } 
    }
}