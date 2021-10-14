package variablesDatosOperadores;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime 4 números enteros");
        int p1=sc.nextInt();int p2=sc.nextInt();int p3=sc.nextInt();int p4=sc.nextInt();
        int suma= p1 + p2;
        int mult= p3 * p4;
        System.out.println("La suma de los dos primeros números es "+ suma);
        System.out.println("El producto del tercer y cuarto número es "+ mult);

    }
}
