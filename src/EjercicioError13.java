public class EjercicioError13{

    static String elipsificar(String titulo, int longitudDeseada) {
        if (titulo.length() <= longitudDeseada) {
            return titulo;
        }

        int posicionEspacio = titulo.indexOf(' ', longitudDeseada);

        if (posicionEspacio == -1) {
            return titulo;
        }

        String tituloRecortado = titulo.substring(0, posicionEspacio);

        if (tituloRecortado.length() < titulo.length()) {
            return tituloRecortado + "…";
        }

        return titulo;
    }

    public static void main(String[] args) {
        System.out.println("\"" + elipsificar("Java is fun", 4) + "\"");     // "Java…"
        System.out.println("\"" + elipsificar("Java is fun", 6) + "\"");     // "Java is…"
        System.out.println("\"" + elipsificar("Java is fun", 11) + "\"");    // "Java is fun"
        System.out.println("\"" + elipsificar("Java is fun", 20) + "\"");    // "Java is fun"
        System.out.println("\"" + elipsificar("Hola mundo programacion", 8) + "\""); // "Hola mundo…"
    }
}