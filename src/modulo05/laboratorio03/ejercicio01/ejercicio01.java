package modulo05.laboratorio03.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1;
        double numero2;
        char signo;

        System.out.print("Ingrese el primer número: ");
        numero1 = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numero2 = input.nextDouble();

        do {
            System.out.print("Ingrese el signo de la operación a realizar [+, -, *, /, %]: ");
            signo = input.next().charAt(0);
        } while (signo != '+' && signo != '-' && signo != '*'
                && signo != '/' && signo != '%');

        hacerOperacion(numero1, numero2, signo);
    }

    private static void hacerOperacion(double numero1, double numero2, char signo) {
        switch (signo) {
            case '+':
                System.out.printf("%f %c %f = %f",
                        numero1, signo, numero2, suma(numero1, numero2));
                break;
            case '-':
                System.out.printf("%f %c %f = %f",
                        numero1, signo, numero2, resta(numero1, numero2));
                break;
            case '*':
                System.out.printf("%f %c %f = %f",
                        numero1, signo, numero2, multiplicacion(numero1, numero2));
                break;
            case '/':
                System.out.printf("%f %c %f = %f",
                        numero1, signo, numero2, division(numero1, numero2));
                break;
            case '%':
                System.out.printf("%f %c %f = %f",
                        numero1, signo, numero2, remainder(numero1, numero2));
                break;
            default:
                System.out.println("Operación no valida");
                break;
        }
    }

    private static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    private static double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    private static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    private static double division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    private static double remainder(double numero1, double numero2) {
        return numero1 % numero2;
    }
}
