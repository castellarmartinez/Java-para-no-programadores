package modulo05.laboratorio04.ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        double numero2;

        System.out.print("Ingrese el numero entero: ");
        numero1 = input.nextInt();
        System.out.print("Ingrese el numero decimal: ");
        numero2 = input.nextDouble();
        System.out.printf("La suma de %d y %f es %f",
                numero1, numero2, suma(numero1, numero2));
    }

    private static double suma(int numero1, double numero2) {
        return numero1 + numero2;
    }
}
