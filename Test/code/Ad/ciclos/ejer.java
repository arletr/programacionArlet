package code.Ad.ciclos;

public class ejer {
    public static Boolean primo(int numero) {
        var contador = 0;
        for (int i=1; i>=numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        System.out.println("Divisores exactos son:" + contador);
        if(contador==2) {
            return true;
        } else {
            return false;
        }
    }
}