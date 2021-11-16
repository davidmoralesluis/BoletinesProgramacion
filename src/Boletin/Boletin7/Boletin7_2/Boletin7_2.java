package Boletin.Boletin7.Boletin7_2;

import javax.swing.*;

public class Boletin7_2 {
    public static void main(String[] args) {

        short num1= Short.parseShort(JOptionPane.showInputDialog("! Introduce el 1º Numero !"));
        short num2=Short.parseShort(JOptionPane.showInputDialog("! Introduce el 2º Numero !"));

        if (num1>=num2){
            JOptionPane.showMessageDialog(null,"la resta es = "+(num1-num2));
        }

        JOptionPane.showMessageDialog(null,"La suma es = "+(num1+num2));

    }
}
