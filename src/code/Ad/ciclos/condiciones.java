package code.Ad.ciclos;

public class condiciones {

    public static boolean tieneTresDigitos(int numero) {
        if ((numero >= 100 && numero <= 999) || (numero <= -100 && numero >= -999)) {
            System.out.println("Tiene 3 digitos contrale");
            return true;
        } else {
            System.out.println("no tiene 3 digitos contrale");
            return false;
        }
    }

    public static boolean esNegativo(int numero) {
        if (numero < 0) {
            System.out.println("es negativo");
            return true;
        } else {
            System.out.println("no es negativo");
            return false;
        }
    }

    public static int sumaDosDigitos(int numero) {
        if (numero >= 10 && numero <= 99) {
            int unidad = numero % 10;
            int decena = numero / 10;
            return unidad + decena;
        } else {
            return 0;
        }
    }

    public static boolean ambosPares(int numero) {
        if (numero >= 10 && numero <= 99) {
            int unidad = numero % 10;
            int decena = numero / 10;
            if (unidad % 2 == 0 && decena % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean esPrimoMenorQue20(int numero) {
        if (numero >= 10 && numero < 20) {
            if (numero < 2) {
                return false;
            } else {
                int i = 2;
                while (i <= Math.sqrt(numero)) {
                    if (numero % i == 0) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        } else {
            return false;
        }
    }
}
