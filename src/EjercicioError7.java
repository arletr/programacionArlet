public class EjercicioError7 {

    static boolean esExterno(String enlace) {
        return enlace.startsWith("http://") || enlace.startsWith("https://");
    }

    public static void main(String[] args) {
        System.out.println(esExterno("/definetely-internal"));
        System.out.println(esExterno("https://www.java.com"));
        System.out.println(esExterno("http://dont-go.com"));
        System.out.println(esExterno("/otro-interno"));
        System.out.println(esExterno("https://google.com"));
    }
}