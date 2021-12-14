package Boletin.Boletin2.Boletin2_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1=teclado.nextInt();
        int num2=teclado.nextInt();

        System.out.println("las suma es : "+(num1+num2));
        System.out.println("las resta es : "+(num1-num2));
    }
}
