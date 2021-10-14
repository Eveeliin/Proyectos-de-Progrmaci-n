package variablesDatosOperadores;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántas ardillas hay?");
        int N=sc.nextInt();
        System.out.println("¿Cuántas nueces?");
        int K=sc.nextInt();
        System.out.println("Hay "+ (K/N)+" nueces y sobran "+(K%N)+" nueces");
//¿se poidria hacer así?¿y los parentesis?
    }
}
