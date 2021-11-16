package Boletin.Boletin5;

public class Consumo {

    //Atributos
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    //constructor
    public Consumo() {

        km = 0;
        litros = 0;
        vMed = 0;
        pGas = 0;
    }

    public Consumo(float km, float litros, float vMed, float pGas) {

        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public float getTempo() {

        return this.km / this.vMed;
    }

    public float consumoMedio() {

        return (this.litros / this.km) * 100;
    }

    public float consumoEuros() {

        return this.consumoMedio() * this.pGas;
    }

    public void setKM(float km) {

        this.km = km;
    }

    public void setLitros(float litros) {

        this.litros = litros;
    }

    public void setvMed(float vMed) {

        this.vMed = vMed;
    }

    public void setpGas(float pGas) {

        this.pGas = pGas;
    }

    public float getvMed() {
        return this.vMed;
    }

}

