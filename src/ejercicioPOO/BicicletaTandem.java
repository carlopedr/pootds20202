/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPOO;

/**
 *
 * @author Usuario
 */
public class BicicletaTandem extends Bicicleta{
    private int numAsientos;

    public BicicletaTandem( int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
        super(velocidadActual, platoActual, piñonActual);
        this.numAsientos = numAsientos;
    }
    
    @Override
    public void acelerar(){
        velocidadActual*=4;
    }
    
}
