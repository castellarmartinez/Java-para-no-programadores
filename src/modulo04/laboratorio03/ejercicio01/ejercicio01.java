package modulo04.laboratorio03.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oracion;
        char caracterMasRepititivo = '\000';
        int numeroRepeticiones = 0;
        String caracteresEvaluados = "";

         do {
            System.out.print("Indique la operación a evaluar (No puede estar vacía): ");
            oracion = input.nextLine();
        } while (oracion.length() == 0);

        for (int i = 0; i < oracion.length(); i++) {
            char caracterActual = oracion.charAt(i);

            if (caracterActual != ' ' && !caracteresEvaluados.contains(String.valueOf(caracterActual))) {
                int conteoCaracter = 1;
                caracteresEvaluados += caracterActual;

                for (int j = i + 1; j < oracion.length(); j++) {
                    if (oracion.charAt(j) == caracterActual) {
                        conteoCaracter++;
                    }
                }

                if (conteoCaracter > numeroRepeticiones) {
                    numeroRepeticiones = conteoCaracter;
                    caracterMasRepititivo = caracterActual;
                }
            }
        }

        System.out.printf("El carácter [%c] se repito %d veces%n", caracterMasRepititivo, numeroRepeticiones);
    }
}
