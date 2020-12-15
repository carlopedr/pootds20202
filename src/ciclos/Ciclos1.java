/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author Usuario
 */
public class Ciclos1 {

    public static void main(String[] args) {
        boolean salir = false;
        /* En este caso el centinela es una variable
        booleana que inicialmente vale falso */
        int n;
        int i = 1;
        while (salir == false && i <= 5) {
            /* Condición de repetición: que salir siga siendo
            falso. Ese es el centinela.
            También se podía haber escrito simplemente:
            while(!salir) */
            n = (int) Math.floor(Math.random() * 1000 + 1); // Lo que se repite en el System.out.println(i); // bucle: calcular un número
            System.out.println("n:" + n);
            //aletorio de 1 a 500 y escribirlo */
            i++;
            salir = (n % 7 == 0);
            /* El centinela vale verdadero si el número es
            múltiplo de 7   */
        }
    }
}
