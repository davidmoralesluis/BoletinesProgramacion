package Boletin.Boletin12.Boletin12_1;

import javax.swing.*;

public class Garaxe {
    private int numeroCoches = 0;
    private String [] opciones=new String[]{"añadir Coche","sacar Coche","salir"};
    private Coche [] plazas;
    private int menu=0;
    private int test =0;
    private String car="";

    public Garaxe(int place) {
        plazas=new Coche[place];

    }


    public void startApp(){
        while (true){

           menu = JOptionPane.showOptionDialog(null,"--Garaxe--\n Hay "+ (5-numeroCoches) +" plaza(s) libre(s)","GARAXE",0,JOptionPane.QUESTION_MESSAGE,null,opciones,this.opciones[0]);


            System.out.println("--"+ menu);

            //añadir Coche
            if(menu ==0){
                if(numeroCoches <5){
                   plazas[numeroCoches]=new Coche("1234"); //(JOptionPane.showInputDialog("Introduce matricula del coche"));
                    this.numeroCoches++;
                }else {
                    JOptionPane.showMessageDialog(null,"!! No hay plazas libres !!");
                }
            }

            //sacar Coche
            if(menu ==1){
                System.out.println("1111");
                if (numeroCoches>0){
                    for (int i = 0; i < plazas.length; i++) {
                        System.out.println("a:"+i);
                        //car+=(i+1)+". "+plazas[i].getMatricula()+"\n";
                        System.out.println("b:"+i);
                    }
                    System.out.println("2222");

                    test=JOptionPane.showOptionDialog(null,"--Garaxe--\n" +car,"GARAXE",0,JOptionPane.QUESTION_MESSAGE,null,plazas,this.plazas[0]);

                    this.numeroCoches--;
                }else {
                    JOptionPane.showMessageDialog(null,"No hay coche(s) en el garage");
                }
            }

            //exit
            if(menu ==2){
                System.out.println(plazas[0]);
                break;
            }
        }
    }
}
