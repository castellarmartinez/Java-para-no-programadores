package modulo04.laboratorio02.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        int numeroIngresado;

        do {
            System.out.print("Para culminar escriba 0, de lo contrario escriba cualquier número: ");
            numeroIngresado = input.nextInt();

            suma += numeroIngresado;

            if (numeroIngresado > numeroMayor) {
                numeroMayor = numeroIngresado;
            }

            if (numeroIngresado < numeroMenor) {
                numeroMenor = numeroIngresado;
            }
        } while (numeroIngresado != 0);

        if (suma != 0) {
            System.out.println("La suma total es: " + suma);
            System.out.println("El número mayor es: " + numeroMayor);
            System.out.println("El número menor es: " + numeroMenor);
        } else {
            System.out.println("No se ingresaron números");
        }
    }
}
