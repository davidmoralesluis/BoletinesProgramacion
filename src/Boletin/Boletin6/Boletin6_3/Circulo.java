package Boletin.Boletin6.Boletin6_3;

import java.lang.Math;

public class Circulo{

    private double radio=0;


    public Circulo(){

    }

    public Circulo(double radio){

        this.radio= radio;
    }

    public void setRadio(double radio){

        this.radio= radio;
    }

    public double getRadio(){

        return this.radio;
    }

    public double calcularArea(){

        return Math.pow(this.radio, 2);
    }

    public double calcularLonxitude(){

        return 2*this.radio*Math.PI;
    }
}
