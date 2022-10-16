package module03.desafio.ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int producto = 1;
        boolean hayNumerosPositivos = false;

        System.out.print("Ingresa el numero 1: ");
        numero1 = input.nextInt();
        System.out.print("Ingresa el numero 2: ");
        numero2 = input.nextInt();
        System.out.print("Ingresa el numero 3: ");
        numero3 = input.nextInt();

        if (numero1 > 0) {
            producto *= numero1;
            hayNumerosPositivos = true;
        }

        if (numero2 > 0) {
            producto *= numero2;
            hayNumerosPositivos = true;
        }

        if (numero3 > 0) {
            producto *= numero3;
            hayNumerosPositivos = true;
        }

        if (hayNumerosPositivos) {
            System.out.println("El producto de los números positivos es: " + producto);
        } else {
            System.out.println("El producto de los números positivos es: no se ingresaron números positivos");
        }
    }
}
