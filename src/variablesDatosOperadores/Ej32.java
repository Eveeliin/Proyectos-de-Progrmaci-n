package variablesDatosOperadores;

import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ve= 0<n && n<10;
        System.out.println(ve);
    }
}
