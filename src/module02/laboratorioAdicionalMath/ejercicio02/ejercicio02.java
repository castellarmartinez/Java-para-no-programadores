package module02.laboratorioAdicionalMath.ejercicio02;

import java.util.Random;
import java.util.Scanner;

public class ejercicio02 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int numeroAleatorio = random.nextInt(27) + 97;
      char letra = (char) numeroAleatorio;
      String palabra;
      String estaLaLetra;

      System.out.print("Ingresa una palabra: ");
      palabra = input.nextLine();

      estaLaLetra = palabra.indexOf(letra) >= 0 ? "está" : "no está";
      System.out.printf("La letra %c %s en la palabra \"%s\"%n", letra, estaLaLetra, palabra);
   }
}
