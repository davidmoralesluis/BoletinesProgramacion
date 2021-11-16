package Boletin.Boletin4;

public class Libro {

    //atributos
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //constructores
    public Libro(){
        titulo="";
        autor="";
        ano=0;
        numPaginas=0;
        valoracion=0;

    }

    public Libro(String titulo, String autor, int ano, short numPaginas){

        this.titulo= titulo;
        this.autor= autor;
        this.ano= ano;
        this.numPaginas= numPaginas;
        this.valoracion=0;
    }

    //getters & setters
    public String Gettitulo(){
        return this.titulo;
    }

    public void Settitulo(String titulo){
        this.titulo=titulo;
    }

    public String Getautor(){
        return this.titulo;
    }

    public void Setautor(String autor){
        this.autor=autor;
    }

    public int Getano(){
        return this.ano;
    }

    public void Setano(int ano){
        this.ano=ano;
    }

    public short GetnumPaginas(){
        return this.numPaginas;
    }

    public void SetnumPaginas(short numP){
        this.numPaginas=numP;
    }

    public float Getvaloracion(){
        return this.valoracion;
    }

    public void Setvaloracion(float valoracion){
        this.valoracion=valoracion;
    }

    public void mostrarLibro(){

        System.out.println("El titulo del libro es: "+this.titulo);
        System.out.println("El autor del libro es: "+this.autor);
        System.out.println("El año del libro es: "+this.ano);
        System.out.println("El numero de paginas del libro es: "+this.numPaginas);
        System.out.println("La valoracion del libro es: "+this.valoracion);
    }

}

