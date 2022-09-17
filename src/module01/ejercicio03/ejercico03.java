package module01.ejercicio03;

public class ejercico03 {
   public static void main(String[] args) {
      System.out.println("A");
      int x = 5;
      int y = 10;
      int suma = 0;
      int resta = 0;
      System.out.println(x);
      System.out.println(y);
      System.out.println(suma);
      System.out.println(resta);

      System.out.println("B");
      suma = x + y;
      resta = x - y;
      System.out.println(suma);
      System.out.println(resta);

      System.out.println("C");
      suma = x + x;
      resta = y - y;
      System.out.println(suma);
      System.out.println(resta);

      System.out.println("D");
      suma = x + y + x;
      resta = x - x - 20;
      System.out.println(suma);
      System.out.println(resta);

      System.out.println("E");
      suma = y + x + x;
      resta = -x - y - y;
      System.out.println(suma);
      System.out.println(resta);
   }
}
