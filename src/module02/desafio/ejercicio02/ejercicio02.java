package module02.desafio.ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double base;
      double exponente;
      int decimales;

      System.out.println("Ingrese dos números.");
      System.out.print("Base: ");
      base = input.nextDouble();
      System.out.print("Exponente: ");
      exponente = input.nextDouble();

      System.out.print("Cuantos decimales quieres ver en el resultado: ");
      decimales = input.nextInt();

      System.out.printf("La potencia de los dos números es %." + decimales + "f%n",
              Math.pow(base, exponente));
   }
}
