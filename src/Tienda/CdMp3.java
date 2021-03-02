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
public class CdMp3 extends Cd {
    private int archivos;

    public CdMp3(int archivos, double capacidad, double serial) {
        super(capacidad, serial);
        this.archivos = archivos;
    }

    public int getArchivos() {
        return archivos;
    }

    public void setArchivos(int archivos) {
        this.archivos = archivos;
    }

    
    
    
    
}
