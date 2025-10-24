public class EjercicioE45 {

    static boolean terminaEnS(String texto) {
        var ultimoCaracter = texto.charAt(texto.length() - 1);
        return (ultimoCaracter == 's') || (ultimoCaracter == 'S');
    }

    public static void main(String[] args) {
        System.out.println(terminaEnS("palabras"));
        System.out.println(terminaEnS("PALABRAS"));
        System.out.println(terminaEnS("palabra"));
        System.out.println(terminaEnS("casas"));
        System.out.println(terminaEnS("perro"));
    }
}