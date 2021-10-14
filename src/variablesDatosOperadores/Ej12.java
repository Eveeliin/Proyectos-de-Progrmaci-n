package variablesDatosOperadores;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Número de tres cifras:");
        int n= sc.nextInt();
        int c=n/100;
        int d=(n%100)/10;
        int u=(n%100)%10;
        System.out.println("Invertido: "+u+d+c);
    }}
