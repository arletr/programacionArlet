import java.util.ArrayList;
import java.util.List;

public class Ciclos {

    public static List<Integer> enterosHastaN(int n) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static List<Integer> paresHastaN(int n) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 2; i <= n; i += 2) {
            lista.add(i);
        }
        return lista;
    }

    public static List<Integer> divisoresDeN(int n) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                lista.add(i);
            }
        }
        return lista;
    }

    public static List<Integer> enterosEntre(int a, int b) {
        List<Integer> lista = new ArrayList<>();
        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);
        for (int i = inicio; i <= fin; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static List<Integer> terminadosEn4Entre(int a, int b) {
        List<Integer> lista = new ArrayList<>();
        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);
        for (int i = inicio; i <= fin; i++) {
            if (i % 10 == 4 || i % 10 == -6) {
                lista.add(i);
            }
        }
        return lista;
    }
}
