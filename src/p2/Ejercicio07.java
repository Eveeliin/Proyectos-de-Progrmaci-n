package p2;
/*
Ejercicio 7 validar que los números que entran por teclado sean
adecuados (positivos, mayor o igual a 0,....) en cada caso.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca minutos:");
        int m = sc.nextInt();
        int h = m / 60;
        int r = m % 60;
        if (m>=0) {
            System.out.println("En " + m + " minutos hay " + h + " horas y " + r + " minutos.");
        } else {
            System.out.println("Número introducido incorrecto");
        }
    }
}
