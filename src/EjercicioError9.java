public class EjercicioError9 {

    static String domain(String url) {
        // Remover el protocolo "https://"
        String sinProtocolo = url.substring(8);

        // Buscar la primera barra "/"
        int primeraBarra = sinProtocolo.indexOf('/');

        // Si no hay barra, retornar toda la cadena
        if (primeraBarra == -1) {
            return sinProtocolo;
        }

        // Si hay barra, retornar solo hasta esa posición
        return sinProtocolo.substring(0, primeraBarra);
    }

    public static void main(String[] args) {
        System.out.println("\"" + domain("https://www.java.com/en/") + "\"");    // "www.java.com"
        System.out.println("\"" + domain("https://jcp.org") + "\"");             // "jcp.org"
        System.out.println("\"" + domain("https://github.com/user/repo") + "\""); // "github.com"
        System.out.println("\"" + domain("https://example.org/") + "\"");         // "example.org"
    }
}