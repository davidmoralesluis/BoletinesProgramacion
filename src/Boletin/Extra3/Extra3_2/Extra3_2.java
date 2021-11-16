package Boletin.Extra3.Extra3_2;

import javax.swing.*;

public class Extra3_2 {
    public static void main(String[] args) {

        int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia !!"));
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes !!"));
        int anno=Integer.parseInt(JOptionPane.showInputDialog("Introduce el año !!"));

        Fecha date=new Fecha();
        date.esFechaValida(dia,mes,anno);
    }
}
