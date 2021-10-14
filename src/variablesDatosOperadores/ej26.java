package variablesDatosOperadores;

import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s= sc.nextDouble();
        double c=(s*0.10)*3;
        System.out.println("Por comisiones obtendras "+(c));
        System.out.println("Al mes obtienes "+(s+c));
    }
}
