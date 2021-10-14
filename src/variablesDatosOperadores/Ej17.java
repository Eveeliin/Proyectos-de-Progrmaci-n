package variablesDatosOperadores;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        double base= sc.nextDouble();
        double altura= sc.nextDouble();
        double area= (base*altura)/2;
        //System.out.println("Área sin decimales es "+area);
        //double area= (base*altura)/2;
        System.out.println("Área con decimales es "+area);



    }
}
