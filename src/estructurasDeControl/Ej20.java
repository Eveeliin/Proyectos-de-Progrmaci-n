package estructurasDeControl;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe 2 numeros:");
        double n1= sc.nextDouble();
        double n2= sc.nextDouble();
        System.out.println("¿Qué operación quieres realizar?");
        String o= sc.next();
        switch (o) {
            case "+":
                System.out.println(n1+ " + "+n2+" = "+(n1+n2));
                break;
            case "-":
                System.out.println(n1+ " - "+n2+" = "+(n1-n2));
                break;
            case "*":
                System.out.println(n1+ " x "+n2+" = "+(n1*n2));
                break;
            case "/":
                System.out.println(n1+ " / "+n2+" = "+(n1/n2));
                break;
            default:
                System.out.println("Operación incorrecta.");
        }
    }
}

