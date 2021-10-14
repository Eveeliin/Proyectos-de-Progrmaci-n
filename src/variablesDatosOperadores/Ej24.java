package variablesDatosOperadores;

import java.net.ServerSocket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("precio");
        double p= sc.nextDouble();
        System.out.println("cant");
        double c= sc.nextDouble();
        System.out.println("iva");
        double i=sc.nextDouble();
        double pro= (i/100);
        double a=pro*p;
        double f=c*(a+p);
        String.format("%.2f", f);
        System.out.println("Paga "+f+" euros");

    }
}
