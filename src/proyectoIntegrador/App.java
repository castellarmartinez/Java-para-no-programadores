package proyectoIntegrador;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rand = Math.random();
        String usuario = "administrador";
        String contrasena = "administrador.1234";
        int token = (int) (rand * 1_000_000);
        String usuarioIngresado;
        String contrasenaIngresada;
        int tokenIngresado;
        int intentos = 1;
        boolean respuestaCorrecta = false;

        System.out.println("Bienvenido al Online Banking, por favor ingrese las " +
                "credenciales solicidatas:\n");
        System.out.println("Clave Token Generada Automaticamente: " + token);

        System.out.print("\nUsuario: ");
        usuarioIngresado = input.nextLine();
        System.out.print("\nContraseña: ");
        contrasenaIngresada = input.nextLine();
        System.out.print("\nClave Token: ");
        tokenIngresado = input.nextInt();

        while (intentos < 3) {
            if (!usuarioIngresado.toLowerCase().equals(usuario) ||
                    !contrasenaIngresada.equals(contrasena) || tokenIngresado != token) {
                System.out.print("\nError de credenciales... Desea intentarlo nuevamente? (S/N): ");
                char respuesta = input.next().charAt(0);

                if (respuesta != 'S') {
                    break;
                }

                input.nextLine();
                intentos++;
            } else {
                System.out.println("Credenciales Correctas, Bienvenido a su Online Backing.");
                respuestaCorrecta = true;
                break;
            }

             System.out.print("\nUsuario: ");
             usuarioIngresado = input.nextLine();
             System.out.print("\nContraseña: ");
             contrasenaIngresada = input.nextLine();
             System.out.print("\nClave Token: ");
             tokenIngresado = input.nextInt();
        }

        if (!respuestaCorrecta && intentos == 3) {
            System.out.println("\nError de credenciales... Usuario Bloqueado, " +
                    "por favor dirijase a la sucursal mas cercana");
        } else {
            System.out.println("Gracias por utilizar Online Backing.");
        }
    }
}
