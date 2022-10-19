package modulo05.laboratorio04.ejercicio04;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese un nombre: ");
        nombre = input.next();
        System.out.printf(saludarPersona(nombre));
    }

    private static String saludarPersona(String nombre) {
        return "Hola ".concat(nombre);
    }
}
