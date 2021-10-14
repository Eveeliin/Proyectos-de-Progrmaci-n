package variablesDatosOperadores;

import javax.swing.*;
import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Las notas de Programación");
        System.out.println("Primera evaluación:"); int p= sc.nextInt();
        System.out.println("Segunda evaluación:"); int s= sc.nextInt();
        System.out.println("Tercera evaluación:"); int t= sc.nextInt();
        int media= (p+s+t)/3;
        System.out.println("Tu media es de: "+media);

    }
}
