package variablesDatosOperadores;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Número de dos cifra:");
        int n= sc.nextInt();
        int d=n/10;
        int u=n%10;
        System.out.println("Invertido: "+u+d);


    }
}
