public class EjercicioError2 {
    public static String pluralizar(int numero, String palabra) {
        if (numero == 1) {
            return palabra;
        } else {
            return numero + " " + palabra + "s";
        }
    }

    public static void main(String[] args) {
        System.out.println(pluralizar(1, "código"));
        System.out.println(pluralizar(2, "código"));
    }
}

