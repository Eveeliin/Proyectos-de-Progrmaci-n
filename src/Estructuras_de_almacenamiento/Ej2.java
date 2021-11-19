package Estructuras_de_almacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] ej =new double[5];
        System.out.println("Escriba los números decimales:");
        for (int i=0; i< ej.length; i++) {
            ej[i] = sc.nextDouble();
        }
        //int i=4 es mejor ej.length -1 !!!!!!!
        for (int i= 4; i>=0; i--) {
            System.out.print(ej[i] + " ");
        }
    }
}
