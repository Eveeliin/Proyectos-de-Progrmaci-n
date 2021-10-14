package variablesDatosOperadores;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
    /*    Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int n= sc.nextInt();
        int suma= n +1;
        int mult= suma* n;
        int suma2= mult+2;
        int mult2= suma2*n;
        int resul= mult2+3;
        System.out.println("El resultado es "+ resul);

     */
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int n= sc.nextInt();
        int resul= ((n + 1) * n + 2) * n + 3;
        System.out.println("El resultado es "+ resul);
        //TONTAAAA
    }
}
