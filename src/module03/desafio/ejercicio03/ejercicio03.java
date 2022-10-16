package module03.desafio.ejercicio03;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario;
        String clave;

        System.out.print("Ingresa el usuario: ");
        usuario = input.nextLine();
        System.out.print("Ingresa la clave: ");
        clave = input.nextLine();

        if (usuario.equals("pepito") && clave.equals("1234")) {
            System.out.println("!Bienvenido pepito!");
        } else if (usuario.equals("pepito")) {
            System.out.println("Contraseña incorrecta");
        } else if (clave.equals("1234")) {
            System.out.println("Usuario incorrecto");
        }
    }
}
