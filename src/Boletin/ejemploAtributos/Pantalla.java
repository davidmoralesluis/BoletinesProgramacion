package Boletin.ejemploAtributos;

public class Pantalla {

    private String modelo;
    private float pulgadas;

    public Pantalla(){
        this.modelo="";
        this.pulgadas=0;
    }

    public Pantalla(String modelo,float pulgadas){
        this.modelo=modelo;
        this.pulgadas=pulgadas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return ("Pantalla{" + "modelo='" + modelo + '\'' + ", pulgadas=" + pulgadas + '}');
    }


}
