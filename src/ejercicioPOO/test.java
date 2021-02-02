/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPOO;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Bicicleta miBicicleta=new Bicicleta(20,42,13);
        Bicicleta tuBicicleta=new Bicicleta(10,24,36);
        System.out.println(miBicicleta.toString());
        System.out.println(tuBicicleta.toString());
        miBicicleta.acelerar();
        System.out.println(miBicicleta.toString());
        miBicicleta.frenar();
        System.out.println(miBicicleta.toString());
        miBicicleta.cambiarPlato(34);
        miBicicleta.cambiarPiñon(24);
        System.out.println(miBicicleta.toString());
        miBicicleta.setVelocidadActual(18);
        System.out.println(miBicicleta.toString());
        miBicicleta.setPlatoActual(0);
        System.out.println(miBicicleta.toString());
        
        
        
        
    }
    
}
