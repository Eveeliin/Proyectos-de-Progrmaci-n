package estructurasDeControl;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo:");
        int n = sc.nextInt();
        if (n >9000) {
            System.out.println("Debes dar impuestos");
        } else {
            System.out.println("No das impuestos");
        }
    }
}
