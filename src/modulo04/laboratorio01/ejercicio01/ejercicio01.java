package modulo04.laboratorio01.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroActual;
        int suma = 0;

        System.out.println("Suma de números enteros: ");
        System.out.print("Para salir escriba 0, de lo contrario escriba cualquier número: ");
        numeroActual = input.nextInt();

        while (numeroActual != 0) {
            suma += numeroActual;

            System.out.print("Para culminar escriba 0, de lo contrario escriba cualquier número: ");
            numeroActual = input.nextInt();
        }

        System.out.println("La suma total es: " + suma);
    }
}
