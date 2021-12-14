package Boletin.HerenciaTest;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nome, String apelidos, int edade, int dorsal, String demarcacion) {
        super(id, nome, apelidos, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void xogarPartido(){

        System.out.println("xogar");
    }

    public void entrenar(){

        System.out.println("entrenando");
    }

    @Override
    public String toString() {
        return super.toString()+"Futbolista{" + "dorsal=" + dorsal + ", demarcacion='" + demarcacion + '\'' + '}';
    }
}
