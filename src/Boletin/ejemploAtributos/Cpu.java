package Boletin.ejemploAtributos;

public class Cpu {

    private int velocidad;

    public Cpu(){
        this.velocidad=0;
    }

    public Cpu(int speed){
        this.velocidad=speed;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Cpu{" + "velocidad=" + velocidad + '}';
    }
}
