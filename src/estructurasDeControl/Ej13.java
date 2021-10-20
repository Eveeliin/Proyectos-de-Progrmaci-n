package estructurasDeControl;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Tipo de Uva:");
        String tipo=sc.next();
        System.out.println("Tamaño de Uva:");
        int tamaño = sc.nextInt();
        System.out.println("Precio inicial:");
        int pi= sc.nextInt();
        System.out.println("Kilos Uvas:");
        int k= sc.nextInt();
        int pf; // Para el calculo con condiciones
        if (tipo.equals("A")) { // ESTO SE USA XQ ES UNA VARIABLE STRING
            if (tamaño==1) {
                pf = pi +20;
            } else {
                pf =pi +30;
            }
        } else { // ahora es B
            if (tamaño==1) {
                pf= pi -30;
            } else {
                pf= pi -50;
            }
    }
}}
