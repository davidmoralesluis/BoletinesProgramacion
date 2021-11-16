package Boletin.Boletin7.Boletin7_4;

public class Persona {

    private String nombre;
    private float peso;

    public Persona(String name, float peso) {
        this.nombre = name;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getPeso() {
        return this.peso;
    }
}
