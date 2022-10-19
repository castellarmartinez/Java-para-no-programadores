package modulo05.laboratorio02.ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int cantidadDeNumerosAleatorios;
        int numeroMaximo;

        System.out.print("Ingrese la cantidad de números aleatorios: ");
        cantidadDeNumerosAleatorios = input.nextInt();

        System.out.print("Ingrese el número aleatorio máximo: ");
        numeroMaximo = input.nextInt();

        int[] numerosAleatorios = new int[cantidadDeNumerosAleatorios];
        boolean[] numerosPrimos = new boolean[cantidadDeNumerosAleatorios];

        for (int i = 0; i < cantidadDeNumerosAleatorios; i++) {
            numerosAleatorios[i] = random.nextInt(numeroMaximo) + 1;
            numerosPrimos[i] = true;

            for (int j = 2; j <= numerosAleatorios[i] / 2; j++) {
                if (numerosAleatorios[i] % j == 0) {
                    numerosPrimos[i] = false;
                    break;
                }
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("El número " + numerosAleatorios[i] +
                    ((numerosPrimos[i] || numerosAleatorios[i] == 1) ?
                            " es" : " no es") + " primo");
        }
    }
}
