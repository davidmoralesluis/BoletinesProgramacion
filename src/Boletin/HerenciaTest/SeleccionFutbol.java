package Boletin.HerenciaTest;

public class SeleccionFutbol {

    private int id;
    private String nome;
    private String apelidos;
    private int edade;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nome, String apelidos, int edade) {
        this.id=id;
        this.nome=nome;
        this.apelidos=apelidos;
        this.edade=edade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public void concentrarse(){

        System.out.println("nos concentramos");
    }

    public void viaxar(){

        System.out.println("viajamos");
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nome='" + nome + '\'' + ", apelidos='" + apelidos + '\'' + ", edade=" + edade + '}';
    }
}
