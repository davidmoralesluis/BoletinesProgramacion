package Boletin.Boletin4;

public class Boletin4 {


    public static void main(String[] args) {

        Libro li = new Libro("Holy bible","jc",0,(short)1000);



        System.out.println("El titulo del libro es: "+li.Gettitulo());
        System.out.println("El autor del libro es: "+li.Getautor() );
        System.out.println("El año del libro es: "+li.Getano() );
        System.out.println("El numero de paginas del libro es: "+li.GetnumPaginas());
        System.out.println("La valoracion del libro es: "+li.Getvaloracion());

    }

}

