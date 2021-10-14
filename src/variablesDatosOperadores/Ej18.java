package variablesDatosOperadores;


import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double grados= sc.nextDouble();
        System.out.println("Reamur= "+grados*0.8);
        //System.out.println("Fahenheit= "+(grados*9/5)+32);//mete parentesis para las operacionesz seguidas de palabras
        System.out.println("Fahenheit= "+((grados*9/5)+32));
        System.out.println("Kelvin= "+(grados+273));
    }
}
