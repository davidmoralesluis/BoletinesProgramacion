package Boletin.Boletin2.Boletin2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce millas mariñas");
        int millas=teclado.nextInt();

        System.out.println(millas+" millas son "+(millas+1852)+" metros");
    }
}
