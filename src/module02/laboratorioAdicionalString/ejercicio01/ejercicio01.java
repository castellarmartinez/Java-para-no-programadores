package module02.laboratorioAdicionalString.ejercicio01;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String parrafo1;
      String parrafo2;

      System.out.print("Ingrese un parrafo: ");
      parrafo1 = input.nextLine();
      System.out.print("Ingrese otro parrafo: ");
      parrafo2 = input.nextLine();

      System.out.println("Son iguales bit a bit? : " + (parrafo1 == parrafo2));
      System.out.println("Son iguales bit a bit? : " + parrafo1.equalsIgnoreCase(parrafo2));

      System.out.println("\nParrafos en Mayusculas:");
      System.out.println(parrafo1.toUpperCase());
      System.out.println(parrafo2.toUpperCase());

      System.out.println("\nParrafos en Minusculas:");
      System.out.println(parrafo1.toLowerCase());
      System.out.println(parrafo2.toLowerCase());

      System.out.println("\nPrimera letra en Mayusculas:");
      System.out.println(parrafo1.toUpperCase().charAt(0) + parrafo1.substring(1));
      System.out.println(parrafo2.toUpperCase().charAt(0) + parrafo2.substring(1));

      System.out.println("\nPrimera letra en Minusculas:");
      System.out.println(parrafo1.toLowerCase().charAt(0) + parrafo1.substring(1));
      System.out.println(parrafo2.toLowerCase().charAt(0) + parrafo2.substring(1));

      System.out.println("\n" + String.join(" , ", parrafo1, parrafo2));
   }
}
