package p2;
/*
Ejercicio 10 validar que el número introducido sea de 2 dígitos.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número de dos dígitos:");
        int n= sc.nextInt();
        if (n>9&&n<100||n<-9&&n>-100) {
            int d = n / 10;
            if (n<0){
                System.out.println("Decenas: " + (d*-1));
            }else {
                System.out.println("Decenas: " + d);
            }
        } else {
            System.out.println("Número introducido distinto de dos dígitos");
        }
    }
}
