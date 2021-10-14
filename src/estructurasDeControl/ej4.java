package estructurasDeControl;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int ne = sc.nextInt();
        int i = sc.nextInt();
        boolean jasp;
        if (e <= 28 && ne > 3 || e<30 && i>28000) {
            jasp=true;
        } else {
            jasp=false;
        }
        System.out.println(jasp);

    }
}
