package variablesDatosOperadores;

import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p = sc.nextDouble();
        double ef= sc.nextDouble();
        double tb= sc.nextDouble();
        System.out.println("Calificación final: "+ (((p*0.55))+((ef*0.3))+((tb*0.15))));
    }
}
