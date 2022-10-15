package module03.laboratorio02.ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String usuario = "deivic";
      String contrasena = "David007";
      String usuarioIngresado;
      String contrasenaIngresada;

      System.out.print("Ingresa el usuario: ");
      usuarioIngresado = input.nextLine();
      System.out.print("Ingresa la contraseña: ");
      contrasenaIngresada = input.nextLine();

      if (usuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada)) {
         System.out.println("Bienvenido al Sistema");
      } else {
         System.out.println("Credenciales incorrectas");
      }
   }
}
