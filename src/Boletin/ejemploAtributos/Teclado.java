package Boletin.ejemploAtributos;

public class Teclado {

    private String marca;
    private float precio;

    public Teclado(){
        this.marca="";
        this.precio=0;
    }

    public  Teclado(String marca, float precio){
        this.marca=marca;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca='" + marca + '\'' + ", precio=" + precio + '}';
    }
}
