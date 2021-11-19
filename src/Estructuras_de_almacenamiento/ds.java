package Estructuras_de_almacenamiento;

import java.util.Scanner;

public class ds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o;
        boolean seguir=true;
        while (seguir) {
            do {
                System.out.println("Elija la operación:\n" + "1.Suma\n" + "2.Resta\n" + "3.Multiplicación\n" + "4.División\n");
                o = sc.nextInt();
                if (o>4||o<1) {
                    System.out.println("El número introducido no corresponde a ninguna operación, inténtalo de nuevo.\n");
                }
            } while (o>4||o<1);

            System.out.println("Introduzca dos números:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            switch (o) {
                case 1:
                    System.out.println("El resultado es " + (n1+n2));
                    break;
                case 2:
                    System.out.println("El resultado es " + (n1-n2));
                    break;
                case 3:
                    System.out.println("El resultado es " + (n1*n2));
                    break;
                case 4:
                    System.out.println("El resultado es " + (n1/n2));
                    break;

            }
            System.out.println("Para realizar otra operación introduzca \"true\", en caso contrario introduzca \"false\": ");
            seguir = sc.nextBoolean();
            if (!seguir) {
                System.out.println("El programa ha finalizado.");
            }
        }
    }
}

