package module01.laboratorio02.ejercicio06;

public class ejercicio06 {
   public static void main(String[] args) {
      final double IVA = 21;
      double remera = 59.90;
      double pantalon = 99.90;
      double campera = 149.90;

      System.out.printf("a) remera: precio = %.2f, precio con iva = %.2f%n",
              remera, (remera * (1 + IVA/100)));
      System.out.printf("a) pantalón: precio = %.2f, precio con iva = %.2f%n",
              pantalon, (pantalon * (1 + IVA/100)));
      System.out.printf("a) campera: precio = %.2f, precio con iva = %.2f%n",
              campera, (campera * (1 + IVA/100)));
   }
}
