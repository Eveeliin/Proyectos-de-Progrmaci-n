package p2;
/*
Ejercicio 8 validar que los números que entran por teclado sean
adecuados (positivos, mayor o igual a 0,....) en cada caso.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántos minutos?");
        int a = sc.nextInt();
        if (a>=0) {
            System.out.println(a + " minutos son " + (a / 60) + " horas y " + (a % 60) + " minutos.");
        } else {
            System.out.println("Número introducido incorrecto");
        }
    }
}
