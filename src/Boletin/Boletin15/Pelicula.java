package Boletin.Boletin15;

public class Pelicula extends Multimedia{

    public String actorPrincipal;
    public String actrizPrincipal;

    public Pelicula(){
        this("","","",0,"","");
    }

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString()+
                "actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                '}';
    }


}
