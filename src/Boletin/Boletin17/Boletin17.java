package Boletin.Boletin17;

import javax.swing.*;

public class Boletin17 {
    public static void main(String[] args) {

        App calcularNota= new App();

        while (true){
            calcularNota.startApp();

            //System.out.println( (double)((int)(x*100))/100    );
            int repeat=JOptionPane.showConfirmDialog(null,"¿ Calcular otra nota ?","calculadora de Notas",JOptionPane.YES_NO_OPTION);
            if (repeat==1){
                break;
            }
        }
    }
}
