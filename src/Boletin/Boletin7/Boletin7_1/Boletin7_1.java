package Boletin.Boletin7.Boletin7_1;

import javax.swing.*;

public class Boletin7_1 {
    public static void main(String[] args) {

        int num= Integer.parseInt(JOptionPane.showInputDialog("! Introduce un Numero !"));

        if(num>=0){
            JOptionPane.showMessageDialog(null,"El numero \"" +num+"\" es positivo");
        }
//        else {
//            JOptionPane.showMessageDialog(null,"El numero \"" +num+"\" es negativo");
//        }
    }
}
