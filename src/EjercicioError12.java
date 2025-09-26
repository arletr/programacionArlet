public class EjercicioError12 {

    static boolean correoElectronicoValido(String correo) {
        int contadorArroba = 0;
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                contadorArroba++;
            }
        }

        if (contadorArroba != 1) {
            return false;
        }

        int posicionArroba = correo.indexOf('@');

        if (posicionArroba == 0) {
            return false;
        }

        String despuesArroba = correo.substring(posicionArroba + 1);

        int contadorPuntos = 0;
        for (int i = 0; i < despuesArroba.length(); i++) {
            if (despuesArroba.charAt(i) == '.') {
                contadorPuntos++;
            }
        }

        if (contadorPuntos != 1) {
            return false;
        }

        int posicionUltimoPunto = despuesArroba.indexOf('.');

        if (posicionUltimoPunto == 0) {
            return false;
        }

        if (posicionUltimoPunto == despuesArroba.length() - 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(correoElectronicoValido("abc@me.com"));
        System.out.println(correoElectronicoValido("abc@me."));
        System.out.println(correoElectronicoValido("abc@mecom"));
        System.out.println(correoElectronicoValido("abc@me@com"));
        System.out.println(correoElectronicoValido("@me.com"));
        System.out.println(correoElectronicoValido("a.bc@me.com"));
    }
}