package Boletin.Boletin11.Boletin11_2;

import javax.swing.*;

public class Boletin11_2 {
    public static void main(String[] args) {
        while (true) {
            int random = (int) (Math.random()*50) + 1;
            System.out.println(random);
            int intentos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos??"));
            int player2 = 0;
            int distancia = 0;
            String text_distancia = "";

            for (int i = 0; i < intentos; i++) {
                player2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero !!\\n intentos: " + (i + 1) + "/" + intentos));
                if (player2 == random) {
                    JOptionPane.showMessageDialog(null, "Siiiiiiiiiii");
                    break;
                } else {
                    distancia = Math.abs(random - player2);
                    if ((distancia != player2) && (distancia <= 5)) {
                        text_distancia = "moi preto";
                    } else {
                        if (distancia <= 10) {
                            text_distancia = "preto";
                        } else {
                            if (distancia <= 20) {
                                text_distancia = "lonxe";
                            } else {
                                text_distancia = "moi lonxe";
                            }
                        }
                    }


                    if (player2 < random) {
                        JOptionPane.showMessageDialog(null, "Fail, el numero buscado es mayor \nPista:" + text_distancia);
                    }
                    if (player2 > random) {
                        JOptionPane.showMessageDialog(null, "Fail, el numero buscado es menor \nPista:" + text_distancia);
                    }
                }
                if (i == intentos - 1) {
                    JOptionPane.showMessageDialog(null, "GAME OVER");
                }
            }


        }

    }
}