package Boletin.Boletin3.Boletin3_2;

import java.util.*;

public class Boletin3_2 {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        float centi;

        System.out.println("Introduce los ºC");
        centi= teclado.nextFloat();

        System.out.println(centi+" ºCelsius son "+(centi+273)+" ºKelvin y "+(centi*1.8+32)+" ºFahrenheit");

    }
}

