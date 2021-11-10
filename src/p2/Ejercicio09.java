package p2;
/*
Ejercicio 9: validar que el momento inicial sea anterior al momento final.
@author: Evelin Lisbeth Reyes Moposita
 */

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora inicial: ");
        int h1 = sc.nextInt();
        System.out.print("Minutos iniciales: ");
        int m1 = sc.nextInt();
        System.out.print("Segundos inciiales: ");
        int s1 = sc.nextInt();
        System.out.print("Hora final: ");
        int h2 = sc.nextInt();
        System.out.print("Minutos finales: ");
        int m2 = sc.nextInt();
        System.out.print("Segundos finales: ");
        int s2 = sc.nextInt();


        int h1s = h1 * 3600;
        int m1s = m1 * 60;
        int momento1 = h1s + m1s + s1;

        int h2s = h2 * 3600;
        int m2s = m2 *60;
        int momento2 = h2s + m2s + s2;

        int D = momento2 - momento1;
        int hD = D / 3600;
        int resto1 = D % 3600;
        int mD = resto1 / 60;
        int sD = resto1 % 60;

        if(hD<0||mD<0||sD<0) {
            System.out.println("El momento final es antes del momento inicial");
        }else {
            System.out.println("Han pasado "+ hD + ":" + mD + ":" + sD);
        }
    }
}
