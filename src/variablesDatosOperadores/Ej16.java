package variablesDatosOperadores;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lado= sc.nextInt();
        int perimetro= lado*4;
        System.out.println("Perímetro es "+perimetro);
    }
}
