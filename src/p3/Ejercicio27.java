package p3;
/*
Ejercicio 27 hacerlos con for.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media=0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Nota "+i+" parcial");
            double p= sc.nextDouble();
            media+=p;
        }
        System.out.println("Nota examen final: ");
        double ef = sc.nextDouble();
        System.out.println("Nota trabajo final: ");
        double tb = sc.nextDouble();
        double notaFinal=((media/3)*0.55) + ((ef * 0.3)) + ((tb * 0.15));
        System.out.printf("Calificación final: %.2f", notaFinal);
    }
}
