package Boletin.Boletin2.Boletin2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el cambio");
        float euroDollar=teclado.nextFloat();

        System.out.println("Introduce euros");
        float euro=teclado.nextFloat();

        System.out.println(euro+" euros son "+euro*euroDollar+" dollares");
    }
}
