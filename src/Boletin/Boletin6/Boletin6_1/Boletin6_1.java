package Boletin.Boletin6.Boletin6_1;

public class Boletin6_1 {
    public static void main(String[] args) {

        Coche auto= new Coche();

        System.out.println(auto.getVelocidade());

        auto.acelerar(20);

        System.out.println(auto.getVelocidade());

        auto.frenar(10);

        System.out.println(auto.getVelocidade());
    }

}
