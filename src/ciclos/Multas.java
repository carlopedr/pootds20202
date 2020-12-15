/*
El departamento de policía de la ciudad ha acumulado información referente a las infracciones de los límites de velocidad durante un determinado período de tiempo. El departamento ha dividido la ciudad en cuatro cuadrantes y desea realizar una estadística de las infracciones a los límites de velocidad en cada uno de ellos. Para cada infracción se capturan los siguientes datos:

Número de registro del vehículo (código numérico), cuadrante en el que se produjo la infracción (1 a 4), límite de velocidad permitido en km/h (entero), velocidad real desarrollada en km/h (entero).

Diseñe un programa para producir dos informes; el primero, que contiene una lista de las multas de velocidad recolectadas, donde la multa se calcula como la suma del costo de la infracción ($50) más $20 por cada km/h que se ha excedido la velocidad límite. Por ejemplo:
El vehículo con registro 76234 registró una velocidad de 85 km/h en una zona de 60 km/h, por lo que la multa se calculó de la siguiente forma: 50 + (85-60)*20 = 350
Registro	Velocidad registrada	Velocidad límite	Multa
76234	85	60	$350
…..			
Este informe debe ser seguido de un segundo, en el cual se proporciona un análisis de las infracciones por cuadrante. Para cada uno de los cuatro cuadrantes mencionados, debe darse el número de infracciones y la multa promedio. Por ejemplo:

Cuadrante 1. Total de infracciones:         Multa promedio:   ___        
….
Cuadrante 4. Total de infracciones:         Multa promedio:  ____         

La multa promedio se calcula sumando el monto de todas las multas en un cuadrante y dividiendo entre el número de multas en ese cuadrante.

NOTA: Suponga que se acumularon datos de N infracciones.

 */
package ciclos;

import java.util.Scanner;

public class Multas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reg, cuad, lim_vel, vel_real, multa;
        int ninf1=0, ninf2=0, ninf3=0, ninf4=0, ninf=1;
        int acmul1=0, acmul2=0, acmul3=0, acmul4=0;
        float promul1, promul2, promul3, promul4;
        boolean fin=false;
        String rta;
        while(fin==false){
            System.out.println("No. Infracción: "+ninf);
            System.out.print("No. Reg. Vehículo:");
            reg=input.nextInt();
            System.out.print("Cuadrante:");
            cuad=input.nextInt();
            System.out.print("Límite Velocidad:");
            lim_vel=input.nextInt();
            System.out.print("Velocidad real:");
            vel_real=input.nextInt();
            multa=50+(vel_real-lim_vel)*20;
            System.out.println("Registro   Vel.Reg    Vel.Lim   Multa");
            System.out.println(reg+"     "+vel_real+"      "+lim_vel+"         "+multa);
            //Pendiente los demas cálculos
            switch (cuad){
                case 1:
                    ninf1++;
                    acmul1=acmul1+multa;
                    break;
                case 2:
                    ninf2++;
                    acmul2=acmul2+multa;
                    break;  
                case 3:
                    ninf3++;
                    acmul3=acmul3+multa;
                    break;
                case 4:
                    ninf4++;
                    acmul4=acmul4+multa;
    
            }
            System.out.print("Desea continuar (S/N):");
            rta=input.next();
            if(rta.equals("N"))
                fin=true;
        }
        System.out.println("Cuadrante 1. No. Inf: "+ninf1+" Prom. Multas:"+ acmul1/ninf1);
        System.out.println("Cuadrante 2. No. Inf: "+ninf2+" Prom. Multas:"+ acmul2/ninf2);
        System.out.println("Cuadrante 3. No. Inf: "+ninf3+" Prom. Multas:"+ acmul3/ninf3);
        System.out.println("Cuadrante 4. No. Inf: "+ninf4+" Prom. Multas:"+ acmul4/ninf4);
      }
}
