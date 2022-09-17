package module01.laboratorio01.ejercicio04;

public class ejercicio04 {
   public static void main(String[] args) {
      System.out.println("A");
      int x = 5;
      int y = 10;
      int multi = 1;
      int division = 1;
      System.out.println(x);
      System.out.println(y);
      System.out.println(multi);
      System.out.println(division);

      System.out.println("B");
      multi = x * y;
      division = x / y;
      System.out.println(multi);
      System.out.println(division);

      System.out.println("C");
      multi = x * x;
      division = y / y;
      System.out.println(multi);
      System.out.println(division);
      System.out.println("D");

      multi = x * y * x;
      division = y / x;
      System.out.println(multi);
      System.out.println(division);

      System.out.println("E");
      multi = x * (-y);
      division = y / (-x);
      System.out.println(multi);
      System.out.println(division);
   }
}
