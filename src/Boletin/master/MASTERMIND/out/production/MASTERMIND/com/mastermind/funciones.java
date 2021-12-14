package Boletin.master.MASTERMIND.out.production.MASTERMIND.com.mastermind;

package com.mastermind;

import javax.swing.*;

public class Funciones {

    public static String generarAleatorio() {
        return (int)(Math.random()*10000)+"";
    }

    public static String pedirSecuencia() {
        return JOptionPane.showInputDialog("!! Introduce Codigo !!");
    }

    public static boolean comprobarSecuencia(String aleatorio, String secuencia) {
        if (aleatorio.equalsIgnoreCase(secuencia)){
            return true;
        }else {
            return false;
        }
    }

    public static String mostrarPista(String aleatorio, String secuencia) {
        String pista="";
        for (int i = 0; i < aleatorio.length(); i++) {
            if (aleatorio.charAt(i)==secuencia.charAt(i)){
                pista+="O";
            } else {
                for (int j = 0; j < aleatorio.length(); j++) {
                    if (secuencia.charAt(j)==aleatorio.charAt(i)){

                    }
                }
            }
        }
        return pista;
    }

    public static void mostrar(String word) {
    }
}
