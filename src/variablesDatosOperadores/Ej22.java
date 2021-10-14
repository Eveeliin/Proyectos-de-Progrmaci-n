package variablesDatosOperadores;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Las notas de finales de los modulos");
        System.out.println("Sistemas:"); float a= sc.nextFloat();
        System.out.println("ED:"); float b= sc.nextFloat();
        System.out.println("BBDDD:"); float c= sc.nextFloat();
        System.out.println("Programación:"); float d= sc.nextFloat();
        System.out.println("FOL:"); float e= sc.nextFloat();
        System.out.println("Lenguaje de marcas:"); float f= sc.nextFloat();
        double media= ((a+b+c+d+e+f)/6);
        String.format("%.2f", media);
        System.out.println("Tu media es de: "+(media));
       // int fin= Math.round(media);
      //  System.out.println("Tu nota final es: "+fin);
    }
}
