package module02.desafio.ejercicio01;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String nombre;
      String apellido;

      System.out.print("Ingresa tu nombre y apellido: ");
      nombre = input.next();
      apellido = input.next();

      System.out.printf("El nombre es %s.%n", nombre);
      System.out.printf("El apellido es %s.%n", apellido);

      System.out.printf("Nombre con inicial en mayúscula %s.%n",
              (nombre.toUpperCase().charAt(0) + nombre.substring(1)));
      System.out.printf("Apellido con inicial en mayúscula %s.%n",
              (apellido.toUpperCase().charAt(0) + apellido.substring(1)));
   }
}
