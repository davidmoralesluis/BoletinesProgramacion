package Boletin.Boletin12.Boletin12_2;

public class Boletin12_2 {
    public static void main (String [] args) {
        Clase1 obj1= new Clase1(5,4);

        System.out.println(obj1.modificar(4)+" ");

        Clase1 obj2= new Clase1(5,4);

        System.out.println(obj2.modificar(5)+" ");

        obj2=obj1; // aqui le asignamos los valores de obj1 a obj2
        System.out.println(obj2.modificar(5)+" ");


    }//fin main
}
