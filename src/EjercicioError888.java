public class EjercicioError888{

    static String extension(String ruta) {
        int ultimoPunto = ruta.lastIndexOf('.');
        if (ultimoPunto == -1 || ultimoPunto == ruta.length() - 1) {
            return "";
        }
        return ruta.substring(ultimoPunto + 1);
    }

    public static void main(String[] args) {
        System.out.println("\"" + extension("debug.sh") + "\"");                    // "sh"
        System.out.println("\"" + extension("/path/to/debug.sh") + "\"");           // "sh"
        System.out.println("\"" + extension("/the.dot/file.java") + "\"");          // "java"
        System.out.println("\"" + extension("no-extension") + "\"");                // ""
        System.out.println("\"" + extension("archivo.") + "\"");                    // ""
        System.out.println("\"" + extension("test.txt") + "\"");                    // "txt"
    }
}
