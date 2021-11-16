package Boletin.Boletin3.Boletin3_3;

import java.util.*;

public class Boletin3_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int eu100,eu50,eu20,eu5,eu1;

        System.out.println("Introduce cuantos billetes de 100€");
        eu100=teclado.nextInt();

        System.out.println("Introduce cuantos billetes de 50€");
        eu50=teclado.nextInt();

        System.out.println("Introduce cuantos billetes de 20€");
        eu20=teclado.nextInt();

        System.out.println("Introduce cuantos billetes de 5€");
        eu5=teclado.nextInt();

        System.out.println("Introduce cuantos monedas de 1€");
        eu1=teclado.nextInt();

        System.out.println("En total son "+((eu100*100)+(eu50*50)+(eu20*20)+(eu5*5)+(eu1))+"€");


    }

}

