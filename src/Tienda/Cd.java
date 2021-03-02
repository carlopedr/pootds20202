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
public class Cd {
    public double capacidad;
    public double serial;

    public Cd(double capacidad, double serial) {
        this.capacidad = capacidad;
        this.serial = serial;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getSerial() {
        return serial;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setSerial(double serial) {
        this.serial = serial;
    }
    
    
}
