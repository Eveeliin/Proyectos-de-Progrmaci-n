package p3;
/*
Ejercicio 26: en vez de 3 ventas pedir por teclado el número de ventas realizadas.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base:");
        double base = sc.nextDouble();
        System.out.println("Número de ventas realizadas:");
        double n=sc.nextDouble();
        double ventas=0;
        for (int i = 1; i <=n; i++) {
            System.out.println("Importe venta "+i+":");
            double p= sc.nextDouble();
            ventas+=p;
        }
        double comisión = (ventas/n)*0.1;
        double sueldo = base + comisión;
        System.out.println("Comisión: "+comisión);
        System.out.println("Sueldo total: " + sueldo);
    }
}
