/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
