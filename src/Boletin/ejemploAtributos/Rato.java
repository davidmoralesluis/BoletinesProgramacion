package Boletin.ejemploAtributos;

public class Rato {
    private String fios;

    public Rato(){
        this.fios ="";
    }

    public Rato(String type){
        this.fios =type;
    }

    public void setFios(String fios) {
        this.fios = fios;
    }

    public String getFios(){
        return this.fios;
    }

    @Override
    public String toString() {
        return "Rato{" + "fios='" + fios + '\'' + '}';
    }
}
