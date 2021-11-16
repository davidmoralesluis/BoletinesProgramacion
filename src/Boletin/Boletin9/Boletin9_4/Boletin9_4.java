package Boletin.Boletin9.Boletin9_4;

import java.util.Scanner;

public class Boletin9_4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int num=0;

        do{
            System.out.println("!! Introduce un numero !! \n--> '0' para salir <--");
            num=scan.nextInt();
            if (num!=0){
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i+" * "+num+" = "+(i*num));
                }
            }
        }while (num!=0);
    }
}
