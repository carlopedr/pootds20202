/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

/**
 *
 * @author Usuario
 */
public class CdAudio extends Cd{
    private int pistas;

    public CdAudio(int pistas, double capacidad, double serial) {
        super(capacidad, serial);
        this.pistas = pistas;
    }

    public int getPistas() {
        return pistas;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }

    
    
    
    
}
