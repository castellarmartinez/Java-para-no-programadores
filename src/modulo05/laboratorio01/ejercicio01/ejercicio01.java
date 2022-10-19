package modulo05.laboratorio01.ejercicio01;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        String fraseSinSignos;
        String[] palabras;
        String[] letras;
        String palabraRepetida = "";
        int numeroDePalabras;
        int cantidadRepeticiones = 1;

        do {
            System.out.print("Indique la oración a evaluar (no puede estar vacía): ");
            frase = input.nextLine();
        } while (frase.length() == 0);

        fraseSinSignos = frase.replace(",", "")
                .replace(".", "")
                .replace(";", "")
                .replace(";", "")
                .replace("¿", "")
                .replace("?", "")
                .replace("¡", "")
                .replace("!", "");

        palabras = fraseSinSignos.split(" ");
        letras = fraseSinSignos.replace(" ", "").split("");
        numeroDePalabras = palabras.length;
        Arrays.sort(palabras);
        Arrays.sort(letras);

        for (int i = 0; i < palabras.length; i++) {
            String palabraAuxiliar = palabras[i];
            int contadorAuxiliar = 0;

            for (int j = i; j < palabras.length; j++) {
                if (palabras[j].equals(palabraAuxiliar)) {
                    contadorAuxiliar++;
                }
            }

            if (contadorAuxiliar > cantidadRepeticiones) {
                cantidadRepeticiones = contadorAuxiliar;
                palabraRepetida = palabraAuxiliar;
            }

        }

        System.out.println("La cantidad de palabras que contiene la oración es: " +
                numeroDePalabras);
        System.out.println(cantidadRepeticiones > 1
                ? ("La palabras que se repite es [" + palabraRepetida + "] " + cantidadRepeticiones + " veces")
                : "Ninguna palabra se repite");
        System.out.println("Palabras ordenadas: ");
        System.out.println(Arrays.toString(palabras));
        System.out.println("Letras ordenadas: ");
        System.out.println(Arrays.toString(letras));
    }
}
