package Boletin.Boletin15;

public class Discos extends Multimedia{

    private String xenero;

    public Discos() {
        this("","","",0,"");
    }

    public Discos(String titulo, String autor, String formato, int duracion, String xenero) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {
        return super.toString() +
                "xenero='" + xenero + '\'' +
                "xenero='" + xenero + '\'' +
                '}';
    }
}
