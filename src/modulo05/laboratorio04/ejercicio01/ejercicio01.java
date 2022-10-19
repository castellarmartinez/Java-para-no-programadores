package modulo05.laboratorio04.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        String[] palabras;

        do {
            System.out.print("Indique la palabra a evaluar (no puede estar vacía): ");
            frase = input.nextLine();
        } while (frase.length() == 0);

        palabras = frase.split(" ");

        for (String palabra: palabras) {
            System.out.printf("%s %s palindromo%n", palabra, (esPalindromo(palabra) ? "es" : "no es"));
        }
    }

    private static boolean esPalindromo(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i -1)) {
                return false;
            }
        }

        return true;
    }
}
