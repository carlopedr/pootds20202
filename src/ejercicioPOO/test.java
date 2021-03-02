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
        //Bicicleta miBicicleta=new Bicicleta();
        //System.out.println(miBicicleta.toString());
        Bicicleta miB = new Bicicleta(15,42,25);
        miB.imprimir();
        
        //BicicletaMontaña miBM = new BicicletaMontaña(20,34,21,10);
        //BicicletaTandem miBT = new BicicletaTandem(19,24,30,2);
        
        //Bicicleta misB[]={miB,miBM,miBT};
        
        //for (int i = 0; i < misB.length; i++) {
        //    misB[i].acelerar();
        //    System.out.println(misB[i].toString());
        //}
        //System.out.println("Despues de acelerar...");
        //System.out.println(miB.toString());
        //System.out.println(miBM.toString());
        //System.out.println(miBT.toString());
    
        
    }
    
}
