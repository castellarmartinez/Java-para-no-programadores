package modulo05.desafio.ejercicio03;

public class ejercicio03 {
    public static void main(String[] args) {
        double[] inflaciones = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
                "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        double inflacionTotal = 0;
        double maximaInflacion = Double.MIN_VALUE;
        String mesMaximaInflacion = null;
        double minimaInflacion = Double.MAX_VALUE;
        String mesMinimaInflacion = null;

        for (int i = 0; i < inflaciones.length; i++) {
            inflacionTotal += inflaciones[i];

            if (inflaciones[i] > maximaInflacion) {
                maximaInflacion = inflaciones[i];
                mesMaximaInflacion = meses[i];
            }

            if (inflaciones[i] < minimaInflacion) {
                minimaInflacion = inflaciones[i];
                mesMinimaInflacion = meses[i];
            }
        }

        System.out.printf("La inflación total es %.1f%n", inflacionTotal);
        System.out.printf("La inflación mas baja es %.1f y sucedió en el mes %s%n",
                minimaInflacion, mesMinimaInflacion);
        System.out.printf("La inflación mas alta es %.1f y sucedió en el mes %s%n",
                maximaInflacion, mesMaximaInflacion);
        System.out.printf("El promedio de inflación es %.1f%n",
                inflacionTotal / inflaciones.length);
    }
}
