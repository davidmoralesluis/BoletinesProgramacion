package Boletin.Boletin14;

public class Libro extends Publicacion{

    private boolean prestado;

    public Libro(){
        super();
        this.prestado=false;
    }

    public Libro(int codigo,String titulo, int ano, boolean prestado){

    }

    @Override
    public String toString() {
        return super.toString() +"Libro{" + "prestado=" + prestado + '}';
    }

    @Override
    public int getAno() {
        return super.getAno();
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }
}
