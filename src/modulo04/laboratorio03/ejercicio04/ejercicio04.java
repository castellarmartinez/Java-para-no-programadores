package modulo04.laboratorio03.ejercicio04;

public class ejercicio04 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i += 2) {
            suma += i;
        }

        System.out.println("La suma de los números imparaes del 1-10 es: " + suma);
    }
}
