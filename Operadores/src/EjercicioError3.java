public class EjercicioError3{

    static boolean esVocal(char letra) {
        var letraMinuscula = Character.toLowerCase(letra);
        return "aeiou".contains(Character.toString(letraMinuscula));
    }

    public static void main(String[] args) {
        System.out.println(esVocal('a'));
    }
}


