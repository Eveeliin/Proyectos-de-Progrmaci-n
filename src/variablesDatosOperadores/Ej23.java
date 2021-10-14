package variablesDatosOperadores;

import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número:");
        int n= sc.nextInt();
        System.out.println("Dime un porcentaje:");
        double p= sc.nextDouble();
        double pro= (p/100);
        double a=pro*n;
        System.out.println("Incremento de ese número: "+(a+n));
        System.out.println("Decremento de ese número: "+(n-a));
    }
}
