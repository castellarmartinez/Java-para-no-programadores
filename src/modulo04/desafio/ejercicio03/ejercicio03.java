package modulo04.desafio.ejercicio03;

public class ejercicio03 {
    public static void main(String[] args) {
        int suma = 0;

        for (int numero = 1; numero < 25; numero++) {
            if (numero % 2 == 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los números pares del 1 al 25 es: " + suma);
    }
}
