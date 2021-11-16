package Boletin.Boletin6.Boletin6_3;

public class Boletin6_3 {
    public static void main(String[] args) {

        Circulo circ = new Circulo();

        circ.setRadio(5);

        System.out.printf("El radio es = %.1f\n",circ.getRadio());

        System.out.printf("El area es = %.1f\n",circ.calcularArea());

        System.out.printf("La longitud es = %.1f\n",circ.calcularLonxitude());

    }

}

