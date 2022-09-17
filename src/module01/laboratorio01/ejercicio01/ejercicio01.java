package module01.laboratorio01.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Ingresa un número entero de horas y te mostraré " +
              "el equivalente en semanas, días y horas: ");
      int horasIngresadas = input.nextInt();

      int semanas = horasIngresadas / 168;
      int dias = (horasIngresadas % 168) / 24;
      int horas = (horasIngresadas % 168) % 24;

      System.out.printf("%d horas equivalen a %d semanas, %d días y %d horas.",
              horasIngresadas, semanas, dias, horas);
   }
}
