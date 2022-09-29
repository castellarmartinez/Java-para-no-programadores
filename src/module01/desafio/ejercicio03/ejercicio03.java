package module01.desafio.ejercicio03;

public class ejercicio03 {
   public static void main(String[] args) {
      System.out.println("A");
      int x = 10;
      int y = 20;
      System.out.println(x);
      System.out.println(y);
      System.out.println("B");
      x = x + y;
      y = y + x;
      System.out.println(x);
      System.out.println(y);
      System.out.println("C");
      x = x - y;
      y = y - x;
      System.out.println(x);
      System.out.println(y);
      System.out.println("D");
      x = x * y;
      y = x * x;
      System.out.println(x);
      System.out.println(y);
      System.out.println("E");
      x = y / x;
      y = x / y;
      System.out.println(x);
      System.out.println(y);
   }
}
