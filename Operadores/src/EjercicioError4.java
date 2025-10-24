public class EjercicioError4 {

    static String titleCase(String texto) {
        var primeraLetra = texto.substring(0, 1);
        var restoDelTexto = texto.substring(1);
        return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(titleCase("hola"));
        System.out.println(titleCase("mUNDO"));
        System.out.println(titleCase("JAVA"));
    }
}
