package variablesDatosOperadores;


import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d= sc.nextDouble();
        double f=d*0.15;
        System.out.println("Pagas: "+(d-f));
    }
}
