public class EjercicioError6 {

    static boolean esPalindromo(String texto) {
        var primeraLetra = Character.toLowerCase(texto.charAt(0));
        var segundaLetra = Character.toLowerCase(texto.charAt(1));
        return primeraLetra == segundaLetra;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("ab"));
        System.out.println(esPalindromo("ee"));
        System.out.println(esPalindromo("Aa"));
        System.out.println(esPalindromo("BB"));
        System.out.println(esPalindromo("xy"));
    }
}