package Boletin.Extra3.Extra3_1;

//Escribe un programa, de nome Extras3_1, que calcule a cota que se debe abonar nun club de paddel.
//        A cota é de 800 euros. Terán un 40% de desconto as persoas maiores de 65 anos e un 25% de desconto os menores de 21 anos,
//        se os pais non son socios, e un 45% se os pais son socios

import javax.swing.*;

public class Extra3_1 {
    public static void main(String[] args) {
        double cota=800;

        int socio=JOptionPane.showConfirmDialog(null,"Tus padres son socios?","CLUB PADDEL",JOptionPane.YES_NO_OPTION); // si = 0 , no = 1 , x=-1

        if(socio==0){
            cota=cota*0.55;
        }else {
            int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Que edad tienes?","CLUB PADDEL",JOptionPane.INFORMATION_MESSAGE));
            System.out.println(edad);

            if(edad<25){
                cota=cota*0.75;
            }

            if (edad > 65) {
                cota=cota*0.6;
            }
        }

        cota=((double)((int)(cota*100)))/100;

        JOptionPane.showMessageDialog(null,"La cota anual es: "+cota+"€","CLUB PADDEL",JOptionPane.INFORMATION_MESSAGE);

    }
}
