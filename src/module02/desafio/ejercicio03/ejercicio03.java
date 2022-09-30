package module02.desafio.ejercicio03;

import java.util.Scanner;

public class ejercicio03 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String letra1;
      String letra2;

      System.out.println("Ingrese dos letras.");
      System.out.print("Letra 1: ");
      letra1 = input.next();
      System.out.print("Letra 1: ");
      letra2 = input.next();

      System.out.printf("La representación ASCII de la letra %s en minúscula es %d%n",
              letra1, (int) letra1.toLowerCase().charAt(0));
      System.out.printf("La representación ASCII de la letra %s en mayúscula es %d%n",
              letra1, (int) letra1.toUpperCase().charAt(0));
      System.out.printf("La representación ASCII de la letra %s en minúscula es %d%n",
              letra2, (int) letra2.toLowerCase().charAt(0));
      System.out.printf("La representación ASCII de la letra %s en mayúscula es %d%n",
              letra2, (int) letra2.toUpperCase().charAt(0));
   }
}
