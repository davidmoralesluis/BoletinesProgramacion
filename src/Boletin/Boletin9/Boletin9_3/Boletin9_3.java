package Boletin.Boletin9.Boletin9_3;

import javax.swing.*;

public class Boletin9_3 {
    public static void main(String[] args) {

        float base=0,altura=0;

        while (base<=0){
            base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            if(base<=0){
                JOptionPane.showMessageDialog(null,"ERROR \n el numero debe ser positivo");
            }
        }

        while (altura<=0){
            altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            if(altura<=0){
                JOptionPane.showMessageDialog(null,"ERROR \n el numero debe ser positivo");
            }
        }

        JOptionPane.showMessageDialog(null,"el area es: "+base*altura);


    }
}
