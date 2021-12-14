package Boletin.Boletin11.Boletin11_2;

import javax.swing.*;

public class Boletin11_2 {
    public static void main(String[] args) {
        while (true) {
            int random = (int) (Math.random()*50) + 1;
            System.out.println(random);
            int intentos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos??"));
            int player = 0;
            int distancia = 0;
            String textDistancia = "";

            for (int i = 0; i < intentos; i++) {
                player = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero !!\\n intentos: " + (i + 1) + "/" + intentos));
                if (player == random) {
                    JOptionPane.showMessageDialog(null, "Siiiiiiiiiii");
                    break;
                } else {
                    distancia = Math.abs(random - player);
                    if ((distancia != player) && (distancia <= 5)) {
                        textDistancia = "moi preto";
                    } else {
                        if (distancia <= 10) {
                            textDistancia = "preto";
                        } else {
                            if (distancia <= 20) {
                                textDistancia = "lonxe";
                            } else {
                                textDistancia = "moi lonxe";
                            }
                        }
                    }


                    if (player < random) {
                        JOptionPane.showMessageDialog(null, "Fail, el numero buscado es mayor \nPista:" + textDistancia);
                    }
                    if (player > random) {
                        JOptionPane.showMessageDialog(null, "Fail, el numero buscado es menor \nPista:" + textDistancia);
                    }
                }
                if (i == intentos - 1) {
                    JOptionPane.showMessageDialog(null, "GAME OVER");
                }
            }


        }

    }
}