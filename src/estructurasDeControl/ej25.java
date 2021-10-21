package estructurasDeControl;

import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce 2 números:");
        int a= sc.nextInt();//8
        int b=sc.nextInt();//10 i=530 ; i<541 ; i++
        for (;a>=b;b++){
            System.out.println(a);
        }
    }
}
