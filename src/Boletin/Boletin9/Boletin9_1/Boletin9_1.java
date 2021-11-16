package Boletin.Boletin9.Boletin9_1;

import javax.swing.*;

public class Boletin9_1 {
    public static void main(String[] args) {

        int [] num10 = new int[10];
        int positivo=0,negativo=0,cero=0;

        for (int i = 0; i < num10.length; i++) {
            num10[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el "+(i+1)+"º numero"));
        }

        for (int i = 0; i < num10.length; i++) {

            if(num10[i]==0){
                cero++;
            }
            if(num10[i]<0){
                negativo++;
            }
            if(num10[i]>0) {
                positivo++;
            }
        }
        JOptionPane.showMessageDialog(null,cero+"x   ceros\n"+negativo+"x   negativos\n"+positivo+"x   positivos\n");


    }
}
