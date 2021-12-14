package Boletin.ejemploAtributos;

public class Ordenador {

    private String tipo;
    private Pantalla p=     new Pantalla();
    private Cpu cpu=        new Cpu();
    private Teclado t=      new Teclado();
    private Rato r=         new Rato();

    public Ordenador(){
        this.tipo ="";
    }

    public Ordenador(String type, Pantalla p, Cpu cpu, Teclado t, Rato r){
        this.tipo =type;
        this.p=p;
        this.cpu=cpu;
        this.t=t;
        this.r=r;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pantalla getP() {
        return p;
    }

    public void setP(Pantalla p) {
        this.p = p;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Teclado getT() {
        return t;
    }

    public void setT(Teclado t) {
        this.t = t;
    }

    public Rato getR() {
        return r;
    }

    public void setR(Rato r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "portatil='" + tipo + '\'' + ", p=" + p + ", cpu=" + cpu + ", t=" + t + ", r=" + r + '}';
    }
}
