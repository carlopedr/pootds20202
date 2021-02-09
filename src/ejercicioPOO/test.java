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
        
        BicicletaMontaña miBM = new BicicletaMontaña(20,34,21,10);
        System.out.println(miBM.toString());
        
        
        
        
    }
    
}
