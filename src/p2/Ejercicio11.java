package p2;
/*
Ejercicio 11 validar que el número introducido sea de 2 dígitos.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Número de dos cifra:");
        int n= sc.nextInt();
        if (n>10&&n<100) {
            int d = n / 10;
            int u = n % 10;
                System.out.println("Invertido: " + u + d);
        }else {
            System.out.println("Número introducido distinto de dos dígitos");
        }
    }
}
