package modulo04.laboratorio02.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        int numeroIngresado;

        System.out.println("Suma de números ingresados: ");
        System.out.print("Ingresa un número: ");
        numeroIngresado = input.nextInt();

        while (numeroIngresado != 0) {
            suma += numeroIngresado;

            if (numeroIngresado > numeroMayor) {
                numeroMayor = numeroIngresado;
            }

            if (numeroIngresado < numeroMenor) {
                numeroMenor = numeroIngresado;
            }

            System.out.print("Ingresa el siguiente número: ");
            numeroIngresado = input.nextInt();
        }

        if (numeroMenor != Integer.MAX_VALUE && numeroMayor != Integer.MIN_VALUE) {
            System.out.println("La suma de los números ingresados es: " + suma);
            System.out.println("El número mayor ingresado es: " + numeroMayor);
            System.out.println("El número menor ingresado es: " + numeroMenor);
        } else {
            System.out.println("No se ingresaron números");
        }
    }
}
