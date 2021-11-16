package Boletin.Boletin9.Boletin9_2;

public class Boletin9_2 {
    public static void main(String[] args) {

        int suma=0;
        double producto=1;

        for (int i = 10; i <=90 ; i++) {

            suma+=i;
            producto=producto*i;

        }

        System.out.println("la suma es: "+suma+"\nel producto es: "+producto);
    }
}
