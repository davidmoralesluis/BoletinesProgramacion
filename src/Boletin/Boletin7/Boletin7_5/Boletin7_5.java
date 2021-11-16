package Boletin.Boletin7.Boletin7_5;

import javax.swing.*;

public class Boletin7_5 {
    public static void main(String[] args) {

        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor entero para el 1º numero!"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor entero para el 2º numero!"));
        int numero3=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor entero para el 3º numero!"));


        if (numero1>=numero2){
            if (numero1>=numero3){
                JOptionPane.showMessageDialog(null,numero1+" es el mayor numero!");
            }else {
                JOptionPane.showMessageDialog(null,numero3+" es el mayor numero!");
            }
        } else {
            if (numero2>=numero3){
                JOptionPane.showMessageDialog(null,numero2+" es el mayor numero!");
            }else {
                JOptionPane.showMessageDialog(null,numero3+" es el mayor numero!");
            }
        }

    }
}
