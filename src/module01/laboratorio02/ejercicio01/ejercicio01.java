package module01.laboratorio02.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean variableA;
      boolean variableB;
      boolean variableC;

      System.out.println("¿qué valores deben poseer para que las siguientes operaciones" +
              " den los siguientes resultados?\n");
      System.out.println("(variableA && variableB) || (variableA && variableC) = true");
      System.out.println("!(variableA || variableB) && variableC = false\n");

      System.out.print("Ingresa el valor de variableA: ");
      variableA = input.nextBoolean();
      System.out.print("Ingresa el valor de variableB: ");
      variableB = input.nextBoolean();
      System.out.print("Ingresa el valor de variableC: ");
      variableC = input.nextBoolean();

      System.out.println("\nEl valor de la espresión es:");
      System.out.printf("(variableA && variableB) || (variableA && variableC) = %b%n",
              ((variableA && variableB) || (variableA && variableC)));
      System.out.printf("!(variableA || variableB) && variableC = %b%n",
              (!(variableA || variableB) && variableC));
   }
}
