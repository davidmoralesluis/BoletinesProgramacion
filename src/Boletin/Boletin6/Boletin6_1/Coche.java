package Boletin.Boletin6.Boletin6_1;

public class Coche {

    private int velocidade;

    public Coche(){

        this.velocidade = 0;
    }

    public int getVelocidade(){

        return this.velocidade;
    }

    public void acelerar(int valor){

        this.velocidade+= valor;
    }

    public void frenar(int menos){

        this.velocidade-= menos;
    }


}

