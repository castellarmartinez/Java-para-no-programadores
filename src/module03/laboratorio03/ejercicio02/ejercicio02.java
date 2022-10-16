package module03.laboratorio03.ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int opcion;

        System.out.print("Ingresa el primer número: ");
        numero1 = input.nextInt();
        System.out.print("Ingresa el segundo número: ");
        numero2 = input.nextInt();
        System.out.print("Ingresa la operacion (1-suma 2-resta 3-producto 4-división): ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.printf("La suma de %d y %d es %d", numero1, numero2, (numero1 + numero2));
                break;
            case 2:
                System.out.printf("La resta de %d y %d es %d", numero1, numero2, (numero1 - numero2));
                break;
            case 3:
                System.out.printf("La multiplicación de %d y %d es %d", numero1, numero2, (numero1 * numero2));
                break;
            case 4:
                System.out.printf("La división de %d y %d es %d", numero1, numero2, (numero1 / numero2));
                break;
        }
    }
}
