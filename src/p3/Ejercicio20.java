package p3;
/*
Ejercicio 20 hacerlos con for.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double suma=0;
        for ( n=0;n<4;n++){
            double i= sc.nextDouble();
            suma+=i;
        }
        double media = suma / 4;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
