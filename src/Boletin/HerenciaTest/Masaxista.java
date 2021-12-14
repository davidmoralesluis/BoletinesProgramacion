package Boletin.HerenciaTest;

public class Masaxista extends SeleccionFutbol{

    private String titulacion="";
    private int anosExperiencia=0;

    public Masaxista() {
    }

    public Masaxista(int id, String nome, String apelidos, int edade, String titulacion, int anosExperiencia) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaxe(){
        System.out.println("maxase");
    }

    @Override
    public String toString() {
        return "Masaxista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
