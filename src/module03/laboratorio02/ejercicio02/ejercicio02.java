package module03.laboratorio02.ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int temperatura;

      System.out.print("Ingresa la temperatura actual: ");
      temperatura = input.nextInt();

      hacerAccion(temperatura);
   }

   private static void hacerAccion(int temperatura) {
      if (temperatura > 25) {
         System.out.println("Puede caminar y tomar sol\n");
      } else if (temperatura > 15) {
         System.out.println("Puede caminar\n");
      } else if (temperatura > 10) {
         System.out.println("Puede caminar con campera\n");
      } else if (temperatura >= 0) {
         System.out.println("Puede quedarse en casa o salir con paraguas y campera");
         System.out.println("Puede esquiar\n");
      }
   }
}
