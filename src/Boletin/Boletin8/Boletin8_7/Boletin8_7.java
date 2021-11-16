package Boletin.Boletin8.Boletin8_7;

import javax.swing.*;

public class Boletin8_7 {
    public static void main(String[] args) {

        Icon circle = new ImageIcon("circle.png");

        int menu=Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1.Squere \n 2.Triangulo \n 3.Circulo"));
        System.out.println(menu);

        switch (menu){
            case 1:
                float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce lado?","Calucular Cuadrado",JOptionPane.ERROR_MESSAGE));
                JOptionPane.showMessageDialog(null,"La superficie es: "+Math.pow(a,2));
                break;

            case 2:
                float base= Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce base?","Calucular triangulo",JOptionPane.ERROR_MESSAGE));
                float alturaBase= Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce la altura?","Calucular triangulo",JOptionPane.ERROR_MESSAGE));
                JOptionPane.showMessageDialog(null,"La superficie es: "+(base*alturaBase)/2);
                break;

            case 3:
                float radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce radio?","Calucular Circuferencia",JOptionPane.ERROR_MESSAGE));
                JOptionPane.showMessageDialog(null,"La superficie es: "+ String.format("%.2f",(Math.PI*2)*radio));
                break;

            default:
                JOptionPane.showMessageDialog(null,"ERROR");
        }
    }
}
