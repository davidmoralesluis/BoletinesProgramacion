package Boletin.Boletin3.Boletin3_1;

import java.util.*;

public class Boletin3_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float precioPagado, precioTarifa, descuento;

        System.out.println("Introduce el precio tarifa del producto");
        precioTarifa=teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Introduce el precio que has pagado");
        precioPagado=teclado.nextFloat();
        teclado.nextLine();

        descuento= 100-((precioPagado/precioTarifa)*100);

        System.out.println("El descuento es de "+descuento+"%");

    }
}
