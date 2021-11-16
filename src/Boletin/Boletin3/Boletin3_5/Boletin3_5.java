package Boletin.Boletin3.Boletin3_5;

import java.util.Scanner;


public class Boletin3_5 {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int dieta, retencion=36;


        float saldoBruto,saldoLiquido,saldoFixo,comision,irpf,quilometraxe;

        System.out.println("Introduce el salario Fijo");
        saldoFixo=sc.nextFloat();

        System.out.println("Introduce el total de ventas");
        comision= (sc.nextFloat())*0.05f;

        System.out.println("Introduce el total kilometros");
        quilometraxe= (sc.nextFloat())*2;

        System.out.println("Introduce el total de dias de desplazamiento");
        dieta = (sc.nextInt())*30;


        saldoBruto= saldoFixo + comision + quilometraxe + dieta;

        irpf= saldoBruto*0.18f;

        saldoLiquido = saldoBruto-irpf-retencion;

        System.out.println("El saldo bruto es= "+saldoBruto+"\n El saldo liquido es= "+saldoLiquido);

    }
}

