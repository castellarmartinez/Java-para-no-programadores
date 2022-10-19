package modulo05.desafio.ejercicio01;

public class ejercicio01 {
    public static void main(String[] args) {
        int[] arreglo = {10,20,5,15,30,20};
        int total = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int cantidadNumero20 = 0;

        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
            System.out.printf("Indice: %d, Valor: %d%n", i, arreglo[i]);
        }

        System.out.printf("El total de los valores del arreglo es %d%n", total);

        System.out.println("Posiciones impares: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > numeroMayor) {
                numeroMayor = arreglo[i];
            }

            if (arreglo[i] == 20) {
                cantidadNumero20++;
            }

            if (arreglo[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.printf("%nEl número mayor es %d%n", numeroMayor);
        System.out.printf("el número 20 aparece %d veces%n", cantidadNumero20);
    }
}
