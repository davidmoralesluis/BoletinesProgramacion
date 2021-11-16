package Boletin.Boletin7.Boletin7_4;

import javax.swing.*;

public class Boletin7_4 {

    public static void masPeso(Persona p1, Persona p2){
        if(p1.getPeso()> p2.getPeso()){
            JOptionPane.showMessageDialog(null,p1.getNombre()+" es la persona con mayor peso, y pesa "+(p1.getPeso()- p2.getPeso())+" kg mas que "+p2.getNombre());
        } else if (p1.getPeso()< p2.getPeso()){
            JOptionPane.showMessageDialog(null,p2.getNombre()+" es la persona con mayor peso, y pesa "+(p2.getPeso()- p1.getPeso())+" kg mas que "+p1.getNombre());
        } else {
            JOptionPane.showMessageDialog(null,p1.getNombre()+" y "+ p2.getNombre()+" tienen el mismo peso con "+p1.getPeso()+" kg!");
        }
    }

    public static void main(String[] args) {

        String person="";

        Persona p1 = new Persona(JOptionPane.showInputDialog("Introduce el nombre de la 1º persona"),Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso de la 1º persona")));
        Persona p2 = new Persona(JOptionPane.showInputDialog("Introduce el nombre de la 2º persona"),Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso de la 2º persona")));
        masPeso(p1,p2);
    }
}
