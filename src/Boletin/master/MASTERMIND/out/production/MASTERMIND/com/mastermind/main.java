package Boletin.master.MASTERMIND.out.production.MASTERMIND.com.mastermind;

public class main {

        static private int intentos=0;


        public static void main(String[] args) {

            Tablero table=Tablero.getInstance();
            table.setCifraAleatorio(Funciones.generarAleatorio());

            do {
                Funciones.pedirSecuencia();

                // Funciones.comprobarSecuencia(table.getCifraAleatorio(), table.getCifraSecuencia());


                //   System.out.println(table.getCifraAleatorio());

                intentos++;
            } while (intentos<10);

            Funciones.mostrar("GAME OVER");
        }
    }

