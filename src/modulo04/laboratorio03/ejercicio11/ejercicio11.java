package modulo04.laboratorio03.ejercicio11;

public class ejercicio11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= (7 - 2 * i) ; j++) {
                System.out.print('@');
            }

            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= (1 + 2 * i) ; j++) {
                System.out.print('@');
            }

            System.out.println();
        }
    }
}
