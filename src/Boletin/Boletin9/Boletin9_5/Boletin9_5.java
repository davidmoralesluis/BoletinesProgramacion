package Boletin.Boletin9.Boletin9_5;

import java.util.*;

public class Boletin9_5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sueldo=0,trabajadores=0,entre=0;
        float menos1000=0;

        do{
            System.out.println("!! Introduce el sueldo del trabajador !! \n--> '0' para salir <--");
            sueldo=scan.nextInt();
            if (sueldo>0){
                trabajadores++;
                if (sueldo<1000){
                    menos1000++;
                }
                if ((sueldo>=1000)&&(sueldo<1600)){
                    entre++;
                }
            }else {
                System.out.println("!!! No se permite sueldos negativos !!!");
            }
        }while (sueldo!=0);

       System.out.format("\nEn la empresa trabajan %d trabajadores,\n%d trabajador(es) cobra(n) entre 1000 y 1750,\n%3.1f %% cobran menos de 1000€\n",trabajadores,entre,(100/(float)trabajadores)*menos1000);
    }
}
