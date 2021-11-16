package Boletin.Boletin8.Boletin8_6;

import javax.swing.*;

public class Boletin8_6 {

    public static void main(String[] args) {

        double ventas=Double.parseDouble(JOptionPane.showInputDialog("! Introduce las ventas anuales !")) ;

        if (ventas>1000){
            JOptionPane.showMessageDialog(null,"El producto es de primera necesidad");
        }else {
            if (ventas>500){
                JOptionPane.showMessageDialog(null,"El producto es de consumo alto");
            }else {
                if (ventas>100){
                    JOptionPane.showMessageDialog(null,"El producto es de consumo medio");
                }else {
                    JOptionPane.showMessageDialog(null,"El producto es de consumo bajo");
                }
            }
        }





    }
}
