package Boletin.Boletin12.Boletin12_1;

import javax.swing.*;

public class Coche {

    private String matricula;
    private double tiempo=0;
    private double precio=0;

    public Coche() {
        this.matricula = " ";
        this.tiempo=0;
        this.precio=0;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void calculaPrecio(double tiempo, double precio){
        tiempo-=3;
        if(tiempo<=0){tiempo=0;};
        this.precio=1.5+(tiempo*0.2);

        JOptionPane.showMessageDialog(null,"El precio del coche con la matricula: "+this.matricula+", es: "+this.precio);
    }
}
