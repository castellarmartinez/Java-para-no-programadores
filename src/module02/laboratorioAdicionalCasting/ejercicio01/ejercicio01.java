package module02.laboratorioAdicionalCasting.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float numero1;
      float numero2;
      double suma;
      double resta;
      double multiplicacion;
      double division;

      System.out.print("Ingresa un número con decimales simples: ");
      numero1 = input.nextFloat();
      System.out.print("Ingresa otro número con decimales simples: ");
      numero2 = input.nextFloat();
      suma = numero1 + numero2;
      resta = numero1 - numero2;
      multiplicacion = numero1 * numero2;
      division = numero1 / numero2;

      System.out.printf("La suma con dos decimales es %.2f%n", suma);
      System.out.printf("La suma sin decimales es %d%n", ((int) suma));
      System.out.printf("La resta con dos decimales es %.2f%n", resta);
      System.out.printf("La resta sin decimales es %d%n", ((int) resta));
      System.out.printf("La multiplicación con dos decimales es %.2f%n", multiplicacion);
      System.out.printf("La multiplicación sin decimales es %d%n", ((int) multiplicacion));
      System.out.printf("La división con dos decimales es %.2f%n", division);
      System.out.printf("La división con sin decimales es %d%n", ((int) division));
   }
}
