package code.Ad.ciclos;

public class perfecto {
    public static Boolean perfecto(int numero) {
        int suma = 0;
        for (int i = 1; i<=numero; i++) {
            if (numero %i==0) {
                suma++;
            }
        }
        System.out.println("su numero es:" + suma);
        if (suma == 10) {
            return true;
        } else {
            return false;
        }

    }
}
