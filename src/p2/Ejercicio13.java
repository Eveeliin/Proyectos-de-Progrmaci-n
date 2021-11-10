package p2;
/*
Ejercicio 13 validar que los números que entran por teclado sean
adecuados (positivos, mayor o igual a 0,....) en cada caso.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dinero en euros:");
        int d= sc.nextInt();
        if (d>=0) {
            int D = d / 200;
            int v = (d % 200) / 20;
            int dz = ((d % 200) % 20) / 10;
            int s = ((d % 200) % 20) % 10;
            System.out.println(D + " billete de 200, " + v + " billete de 20, "
                    + dz + " billete de 10,y sobran " + s + " euros. ");
        } else {
            System.out.println("Número introducido incorrecto");
        }
    }
}
