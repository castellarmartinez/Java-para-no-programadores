package module03.desafio.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        System.out.print("Ingresa el numero 1: ");
        numero1 = input.nextInt();
        System.out.print("Ingresa el numero 2: ");
        numero2 = input.nextInt();
        System.out.print("Ingresa el numero 3: ");
        numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1 + " es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + " es el mayor");
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.println(numero3 + " es el mayor");
        }
    }
}
