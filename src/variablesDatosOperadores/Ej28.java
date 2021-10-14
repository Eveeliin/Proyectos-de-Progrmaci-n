package variablesDatosOperadores;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 4 números:");
        //double n1= sc.nextDouble();
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        //System.out.println("Decremento de los números: " + (n1-(n1*0.1)) + " " +(n2-(n2*0.1))+" "+(n3-(n3*0.1))+" "+(n4-(n4*0.1)));
        System.out.println(--n1 + " " + --n2);
    }
    }
