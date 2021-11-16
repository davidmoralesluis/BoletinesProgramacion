package Boletin.Boletin5;

import java.util.*;

public class Boletin5 {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        // A
        Consumo coche= new Consumo();

        // B
        coche.setLitros(50);
        coche.setpGas(1.57f);

        // C
        Consumo moto= new Consumo(180,10,120,1.50f);

        // D

        System.out.printf("El consumo medio de la moto es %.2f \n",moto.consumoMedio());


        // E
        moto.setLitros(11);

        // F

        System.out.printf("La velocidad media de la moto es %.1f \n",moto.getvMed());

    }

}

