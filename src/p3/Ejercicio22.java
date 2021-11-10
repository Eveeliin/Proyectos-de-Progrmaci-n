package p3;
/*
Ejercicio 22 hacerlos con for.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double suma=0;
        System.out.println("Las notas de finales de los modulos");
        for (int n=1;n<=6;n++) {
            System.out.println("Asignatura "+n+":");
            double i = sc.nextDouble();
            suma += i;
        }
        double media= (suma/6);
        String.format("%.2f", media);
        System.out.printf("Tu media es de: %.2f", media);

    }
}
