package p2;
/*
Ejercicio 6 validar que los números que entran por teclado sean
adecuados (positivos, mayor o igual a 0,....) en cada caso.
@author: Evelin Lisbeth Reyes Moposita
 */
import java.util.Scanner;

public class Ejercicio06 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("¿Cuántas ardillas hay?");
      int N=sc.nextInt();
      System.out.println("¿Cuántas nueces?");
      int K=sc.nextInt();
      if (N>0) {
         if (K>0){
            System.out.println("Hay " + (K / N) + " nueces y sobran " + (K % N) + " nueces");
         } else if (K==0){
            System.out.println("No hay ninguna nuez para las ardillas");
         }
      } else {
         System.out.println("Número introducidos incorrectos");
      }
   }

}
