package Boletin.Extra3.Extra3_2;

import javax.swing.*;

public class Fecha {
    int dia,mes,anno,limit;
    boolean valido,bisiesto=false;

    Fecha(){
        this.dia=0;
        this.mes=0;
        this.anno=0;
        this.bisiesto=false;
        this.valido=true;
        this.limit=0;
    }

    public void esFechaValida(int dia,int mes,int anno){

        if ((anno>=1600)&&(anno<=3000)){
            if ((this.anno % 4 == 0) && ((this.anno % 100 != 0) || (this.anno % 400 == 0))){
                this.bisiesto=true;
            }
            else{
                this.bisiesto=false;
            }
            this.anno=anno;
        }else {
            JOptionPane.showMessageDialog(null,"Fecha no valida");
            this.valido=false;
        }

        if(valido){
            if ((mes>=1)&&(mes<=12)){
                this.mes=mes;
            }else {
                JOptionPane.showMessageDialog(null,"Fecha no valida");
                this.valido=false;
            }
            switch (mes){
                case 1 :

                case 3 :

                case 5 :

                case 7 :

                case 8 :

                case 10 :

                case 12 :   this.limit=31;
                    break;

                case 2 :if(bisiesto){
                    this.limit=29;
                }else {
                    this.limit=28;
                }
                    break;

                case 4 :

                case 6 :

                case 9 :

                case 11 :   this.limit=30;
                    break;

                default:break;
            }
        }

        if(valido){
            if ((dia>0)&&(dia<=limit)){
                this.dia=dia;
            }else {
                JOptionPane.showMessageDialog(null,"Fecha no valida");
                this.valido=false;
            }

            if(valido){
                JOptionPane.showMessageDialog(null,"La fecha introducida es: "+this.dia+"."+this.mes+"."+this.anno);
            }
        }
    }
}
