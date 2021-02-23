/*
BicicletaMontaña tiene un atributo suspension de
tipo entero y un método cambiarSuspension(int
suspension)
 */
package ejercicioPOO;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BicicletaMontaña extends Bicicleta {
    private int suspension;
    
    public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension){
        super(velocidadActual, platoActual, piñonActual);
        this.suspension=suspension;
    }
    
    public void cambiarSuspension(int suspension){
        
    }

    @Override
    public String toString() {
        return "BicicletaMonta\u00f1a{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pi\u00f1onActual=" + piñonActual + "suspension=" + suspension + '}';
    }
    
    @Override
    public void acelerar(){
        velocidadActual*=3;
    }
    
}
