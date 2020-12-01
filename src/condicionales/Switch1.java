/*
Menu Areas
 1. Círculo
 2. Rectángulo
 3. Triángulo
 4. Trapecio
 5. Salir
Seleccione la opción:
 */
package condicionales;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;


public class Switch1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("Menu Areas");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.println("Seleccione la opción:");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Área del cículo");
                float radio;
                double area;
                System.out.println("Ingrese el radio:");
                radio=input.nextFloat();
                area=PI*pow(radio,2);
                System.out.println("Area="+area);
                break;
            case 2:
                System.out.println("Área del reactángulo");
                break;
            case 3:
                System.out.println("Área del triángulo");
                break;
            case 4:
                System.out.println("Área del trapecio");
                break;
            case 5: 
                System.out.println("Salida...");
                break;
            default:
                System.out.println("Opcion equivocada...");
        
    }

    }
}
    
