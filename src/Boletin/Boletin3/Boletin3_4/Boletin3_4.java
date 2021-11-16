package Boletin.Boletin3.Boletin3_4;

import java.util.*;

public class Boletin3_4 {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        double total,eu100,eu50,eu20,eu5,eu1;

        System.out.println("Introduce la cantidad total en €");
        total=teclado.nextDouble();

        eu100=(int)(total/100);
        total=total%100;
        // eu100 = 5 y total 50
        eu50=(int)(total/50);
        total=total%50;

        eu20=(int)(total/20);
        total=total%20;

        eu5=(int)(total/5);

        eu1=total%5;

        System.out.println("En total son \n"+eu100+" billetes de 100€\n"+eu50+" billetes de 50€\n"+eu20+" billetes de 20€\n"+eu5+" billetes de 5€\n"+eu1+" monedas de 1€");
    }
}

