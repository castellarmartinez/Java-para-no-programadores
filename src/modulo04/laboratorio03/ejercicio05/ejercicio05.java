package modulo04.laboratorio03.ejercicio05;

public class ejercicio05 {
    public static void main(String[] args) {
        int suma = 0;
        int multiplicacion = 1;

        for (int i = 1; i <= 5; i++) {
            multiplicacion *= i;
            suma += i;
        }

        System.out.println("La resta de la multiplicación de los números del 1 al 5 " +
                "con la suma de los números del 1 al 5: " + (multiplicacion - suma));
    }
}
