package estructurasDeControl;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número:");
        int n = sc.nextInt();
        int i = n % 2; //Asignalo o hazlo directamente ene el if (la operacion)
        if (i == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
