package module01.laboratorio02.ejercicio04;

public class ejercicio04 {
   public static void main(String[] args) {
      boolean n1 = true;
      boolean n2 = false;
      boolean n3 = true;

      System.out.println("n1 = " + n1);
      System.out.println("n2 = " + n2);
      System.out.println("n3 = " + n3);
      System.out.println("a) n1 ^ n2 = " + (n1 ^ n2));
      System.out.println("b) (n1 & !n2) | n3 = " + ((n1 & !n2) | n3));
      System.out.println("c) (n1 | n2) & !n3 = " + ((n1 | n2) & !n3));
   }
}
