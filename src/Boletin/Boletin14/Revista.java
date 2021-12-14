package Boletin.Boletin14;

public class Revista extends Publicacion{

    private int numRevista;

    public Revista(){
        super();
        this.numRevista=0;
    }

    public Revista(int codigo,String titulo,int ano,int num){
        super(codigo,titulo,ano);
        this.numRevista=num;
    }

    @Override
    public int getAno() {
        return super.getAno();
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String toString() {
        return super.toString()+"Revista{" +
                "numRevista=" + numRevista +
                '}';
    }
}
