package Boletin.HerenciaTest;

public class Entrenador extends SeleccionFutbol {

    public String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nome, String apelidos, int edade, String idFederacion) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFederacion='" + idFederacion + '\'' +
                '}';
    }

    public void dirixirPartido() {
        System.out.println("dirixirmos o partido");
    }

    public void dirixirAdestramento() {
        System.out.println("adesta");
    }
}
