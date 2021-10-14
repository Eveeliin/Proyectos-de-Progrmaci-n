package variablesDatosOperadores;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dinero en euros:");
        int d= sc.nextInt();
        int D= d/200;
        int v= (d%200)/20;
        int dz=((d%200)%20)/10;
        int s=((d%200)%20)%10;
        System.out.println(D+" billete de 200, "+v+" billete de 20, "
                +dz+" billete de 10,y sobran "+s+" euros. ");
    }
}
