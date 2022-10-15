package module03.laboratorio01.ejercicio01;

public class ejercicio01 {
   public static void main(String[] args) {
      System.out.println("A");
      int n1 = 20;
      int n2 = 10;
      int n3 = (n1 > n2) ? n1 : 0;
      System.out.println(n3);

      System.out.println("B");
      n3 = (n1 < n2) ? n1 : 0;
      System.out.println(n3);

      System.out.println("C");
      n3 = (n1 == n2) ? n1 : 0;
      System.out.println(n3);

      System.out.println("D");
      n3 = (n1 != n2) ? n1 : 0;
      System.out.println(n3);
   }
}
