package modulo04.desafio.ejercicio02;

public class ejercicio02 {
    public static void main(String[] args) {
        double cantidad = 1_000;

        for (int i = 1; i <= 12; i++) {
            cantidad += cantidad * 0.02;
        }

        System.out.println("La cantidad de dinero que esta persona " +
                "tendrá al cabo de un año: " + cantidad);
    }
}
