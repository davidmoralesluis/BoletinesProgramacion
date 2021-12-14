package Boletin.Excepcions;

import javax.swing.*;

public class MetodosExcepcions {

    public void divisionSinExcepcion(){
        int numerador,denominador,resultado;

        numerador=Integer.parseInt(JOptionPane.showInputDialog("numerador?"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("denominador?"));
        resultado=numerador/denominador;
        System.out.println("resultado: "+resultado);
    }

    public void divisionConExcepcion(){
        int numerador,denominador,resultado;

        try {
            numerador=Integer.parseInt(JOptionPane.showInputDialog("numerador?"));
            denominador=Integer.parseInt(JOptionPane.showInputDialog("denominador?"));
            resultado=numerador/denominador;
            System.out.println("resultado: "+resultado);

        } catch (Exception e){
            System.out.println("FAIL");
        }
    }

    public void divisionPropagarExcepcion () throws ArithmeticException{

        int numerador,denominador,resultado;

        numerador=Integer.parseInt(JOptionPane.showInputDialog("numerador?"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("denominador?"));
        if (numerador==0 | denominador==0){
            throw new ArithmeticException("FAIL");
        }else {
            resultado=numerador/denominador;
            System.out.println("resultado: "+resultado);
        }
        System.out.println("fin");
    }
}
