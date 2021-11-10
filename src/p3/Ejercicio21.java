package p3;
/*
Ejercicio 21 hacerlos con for.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double suma=0;
        for (int n=1;n<=3;n++){
            System.out.println(n + " evaluación:");
            double i= sc.nextDouble();
            suma+=i;
        }
        double media= suma/3;
        System.out.println("Tu media es de: "+media);
    }
}
