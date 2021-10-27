package Boletin.Boletin7.Boletin7_1;

import javax.swing.*;

public class Boletin7_1 {
    public static void main(String[] args) {

        int num= Integer.parseInt(JOptionPane.showInputDialog("! Introduce un Numero !"));

        if(num%2==0){
            JOptionPane.showMessageDialog(null,"El numero \"" +num+"\" es par");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero \"" +num+"\" es impar");
        }
    }
}
