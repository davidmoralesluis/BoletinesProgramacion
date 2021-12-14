package Boletin.TarefaExtra;

import javax.swing.*;

public class Universidade {

    private String codigo;
    private String nome;
    private String [] categoria= new String[]{"Principal","Asociado","Auxiliar"};
    private int cat;
    private String [] posgrao=new String[]{"ningún","Mestría","Doutoramento","Ambas"};
    private int grao;
    private int antiguidade;
    private int horasClase;
    private double soldoBruto;
    private double boniPosgrao;
    private double boniAntiguidade;
    private double montoAFP;
    private double montoSeguroSaude;
    private double soldoNeto;



    public Universidade() {}

    public Universidade(String codigo, String nome, int cat, int grao, int antiguidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cat = cat;
        this.grao = grao;
        if (grao!=0){
            this.antiguidade = Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tienes el grao ??"));
        }
    }

    //public double pagoParcial(int cat,)

}
