package Boletin.Boletin11.Boletin11_1;

import javax.swing.*;
import java.util.Scanner;

public class Boletin11_1 {
    public static void main(String[] args) {

        while (true){
            int player1=Integer.parseInt(JOptionPane.showInputDialog("Player1!! \n Introduce un numero entre 1-50!!"));
            int intentos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos??"));
            int player2=0;


            for (int i = 0; i < intentos; i++) {
                player2=Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero !!\\n intentos: "+(i+1)+"/"+intentos));
                if(player2==player1){
                    JOptionPane.showMessageDialog(null,"Siiiiiiiiiii");
                    break;
                }else {

                    if (player2<player1){
                        JOptionPane.showMessageDialog(null,"Fail, el numero buscado es mayor");
                    }
                    if (player2>player1){
                        JOptionPane.showMessageDialog(null,"Fail, el numero buscado es menor");
                    }
                }
                if (i==intentos-1){
                    JOptionPane.showMessageDialog(null,"GAME OVER");
                }
            }

        }







        }
    }

