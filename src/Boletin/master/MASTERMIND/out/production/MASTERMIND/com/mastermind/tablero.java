package Boletin.master.MASTERMIND.out.production.MASTERMIND.com.mastermind;

public class tablero {

    private String cifraAleatorio;
    private String cifraSecuencia;
    private String cifraPista;

    private Tablero() {
    }

    static Tablero table;

    public static Tablero getInstance(){
        if (table==null){
            table = new Tablero();
        }
        return table;
    }

    public String getCifraAleatorio() {
        return cifraAleatorio;
    }

    public void setCifraAleatorio(String cifraAleatorio) {
        this.cifraAleatorio = cifraAleatorio;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }

    public String getCifraPista() {
        return cifraPista;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }
}
