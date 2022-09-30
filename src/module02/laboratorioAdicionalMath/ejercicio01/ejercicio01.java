package module02.laboratorioAdicionalMath.ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int red = random.nextInt(256);
      int green = random.nextInt(256);;
      int blue = random.nextInt(256);;

      System.out.printf("Color RGB(%d, %d, %d)%n", red, green, blue);
   }
}
