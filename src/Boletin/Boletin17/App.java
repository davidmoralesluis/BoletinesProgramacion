package Boletin.Boletin17;

import javax.swing.*;

public class App {

    private double teoricas,practica,boletin;

    public void startApp(){

        teoricas=((Double.parseDouble(JOptionPane.showInputDialog("Introduce la 1ºnota de teórias")))+(Double.parseDouble(JOptionPane.showInputDialog("Introduce la 2ºnota de teórias"))))/2;
        practica=(Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de práctica")));
        boletin=boletinTotal(Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de boletines")));

        JOptionPane.showMessageDialog(null,"PROBAS TEÓRICAS........."+(double)((int)(teoricas*100))/100 +"\nPROBAS PRÁCTICA........."+(double)((int)(practica*100))/100  +"\nBOLETÍNS......................."+(double)((int)(boletin*100))/100  +"\nNOTA TOTAL................."+(double)((int)(((teoricas*0.4)+(practica*0.4)+(boletin*0.2))*100))/100 );
    }

    private double boletinTotal(double bole){

        double procent=(Double.parseDouble(JOptionPane.showInputDialog("Introduce el procentaje de los boletines realizados")));

        if(procent>90){
            return 2;
        }else{
            if (procent>=70){
                return 1;
            }else {
                return 0;
            }
        }
    }
}
