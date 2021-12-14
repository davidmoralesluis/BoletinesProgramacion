package Boletin.ejemploAtributos;

public class App {
    public static void main(String[] args) {

        Pantalla p = new Pantalla("Loewe",20);
        Cpu cpu = new Cpu(2000);
        Teclado t = new Teclado("primux",15);
        Rato r = new Rato("mouse");

        Ordenador pc = new Ordenador("portatil",p,cpu,t,r);

        //System.out.println(pc);

        //System.out.println(pc.getTipo()+"--"+pc.getP().getModelo()+"--"+pc.getP().getPulgadas()+"--"+pc.getCpu().getVelocidad()+"--"+
        //                    pc.getT().getMarca()+"--"+pc.getT().getPrecio()+"--"+pc.getR().getFios());


        pc.getP().setModelo("Phillips");
        pc.getP().setPulgadas(32);
        pc.getCpu().setVelocidad(3000);
        pc.getT().setMarca("Logitech");
        pc.getT().setPrecio(29.99f);
        pc.getR().setFios("Ratte");

        System.out.println(pc);

    }
}



