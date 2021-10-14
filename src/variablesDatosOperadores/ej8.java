package variablesDatosOperadores;
//Math sqrt(16) raiz de 16
//Math pow(3,5) 3 elevado izq
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántos minutos?");
        int a= sc.nextInt();
        System.out.println(a+" minutos son "+ (a/60)+" horas y "+(a%60)+" minutos.");
    }
}
