/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complejos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Complejo comp1 = new Complejo(2,3);
        Complejo comp2 = new Complejo(4,-5);
        Complejo comp3=comp1.suma(comp2);
        System.out.println(comp3.toString());
        System.out.println(comp1.print());
        System.out.println(comp2.print());
        comp3=comp1.division(comp2);
        System.out.println(comp3.print());
        comp3=comp1.producto(comp2);
        System.out.println(comp3.print());
        
    }
}
