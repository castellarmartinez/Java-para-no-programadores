package module01.laboratorio02.ejercicio02;

public class ejercicio02 {
   public static void main(String[] args) {
      System.out.println("A");
      String palabra_1 = "Hola";
      String palabra_2 = "Mundo";
      String frase = "";
      System.out.println(palabra_1);
      System.out.println(palabra_2);
      System.out.println(frase);

      System.out.println("B");
      frase = palabra_1 + palabra_2;
      System.out.println(palabra_1);
      System.out.println(palabra_2);
      System.out.println(frase);

      System.out.println("C");
      frase = palabra_1 + " \t " + palabra_2;
      System.out.println(palabra_1);
      System.out.println(palabra_2);
      System.out.println(frase);

      System.out.println("D");
      frase = palabra_1 + " \n " + palabra_2;
      System.out.println(palabra_1);
      System.out.println(palabra_2);
      System.out.println(frase);

      System.out.println("E");
      frase = palabra_1 + " \n \t " + palabra_2;
      System.out.println(palabra_2);
      System.out.println(frase);
   }
}
