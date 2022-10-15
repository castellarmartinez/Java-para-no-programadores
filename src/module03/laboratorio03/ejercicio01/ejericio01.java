package module03.laboratorio03.ejercicio01;

import java.util.Scanner;

public class ejericio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char opcion;

      System.out.print("¡Gracias por contactarte con nosotros!\n" +
              "¿En qué podemos ayudarte?\n" +
              "A) Documentación\n" +
              "B) Cotización\n" +
              "C) Asistencia\n" +
              "D) Siniestros\n" +
              "E) Información de Pagos\n" +
              "F) Otras Consultas\n" +
              "G) Anulación\n" +
              "Escribe la letra de la opción seleccionada: ");
      opcion = input.next().charAt(0);

      switch (opcion) {
         case 'A':
            System.out.println("Ingresó a Documentación");
            break;
         case 'B':
            System.out.println("Ingresó a Cotización");
            break;
         case 'C':
            System.out.println("Ingresó a Asistencia");
            break;
         case 'D':
            System.out.println("Ingresó a Siniestros");
            break;
         case 'E':
            System.out.println("Ingresó a Información de Pagos");
            break;
         case 'F':
            System.out.println("Ingresó a Otras Consultas");
            break;
         case 'G':
            System.out.println("Anulación");
            break;
      }

   }
}
