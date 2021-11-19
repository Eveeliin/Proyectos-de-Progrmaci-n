package Estructuras_de_almacenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Longitud del array");
        //Math.random();
        int n= sc.nextInt();
        int suma=0;
        int [] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=(int) (Math.random()*10+1);
            suma+=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Suma de los números:");
        System.out.println(suma);
        //Para ordenar:
        System.out.println("Ordenados:");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
