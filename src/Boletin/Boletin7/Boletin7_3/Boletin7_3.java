package Boletin.Boletin7.Boletin7_3;

import javax.swing.*;

public class Boletin7_3 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("! Introduce un Numero !"));

        if (num > 0) {
            //JOptionPane.showMessageDialog(null,"+");
            System.out.println("+");
        } else if (num < 0) {
            //JOptionPane.showMessageDialog(null,"-");
            System.out.println("-");
        } else {
            //JOptionPane.showMessageDialog(null,"=");
            System.out.println("0");
        }
    }
}
