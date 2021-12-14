package Boletin.Boletin14;

public class Publicacion {

    private int codigo;
    private String titulo;
    private int ano;

    public Publicacion(){
      this(0,"",0);
    }

    public Publicacion(int code,String titel,int year){
        this.codigo=code;
        this.titulo=titel;
        this.ano=year;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                '}';
    }


}
