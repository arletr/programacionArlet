import java.util.Scanner;

class PrimoYNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ejercicio 7 - Ingresa un número de dos dígitos: ");
        int numero = sc.nextInt();
        int absNumero = Math.abs(numero);

        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número no es negativo.");
        }

        boolean esPrimo = true;
        if (absNumero <= 1) esPrimo = false;
        for (int i = 2; i <= absNumero / 2; i++) {
            if (absNumero % i == 0) esPrimo = false;
        }

        if (esPrimo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        sc.close();
    }
}

class DigitosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ejercicio 8 - Ingresa un número de dos dígitos: ");
        int numero = sc.nextInt();
        int d1 = Math.abs(numero) / 10;
        int d2 = Math.abs(numero) % 10;

        if ((d1==2 || d1==3 || d1==5 || d1==7) && (d2==2 || d2==3 || d2==5 || d2==7)) {
            System.out.println("Ambos dígitos son primos.");
        } else {
            System.out.println("No ambos dígitos son primos.");
        }

        sc.close();
    }
}

class MultiploEntreDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ejercicio 9 - Ingresa un número de dos dígitos: ");
        int numero = sc.nextInt();
        int d1 = Math.abs(numero) / 10;
        int d2 = Math.abs(numero) % 10;

        if (d1 != 0 && d2 % d1 == 0) {
            System.out.println(d2 + " es múltiplo de " + d1);
        } else if (d2 != 0 && d1 % d2 == 0) {
            System.out.println(d1 + " es múltiplo de " + d2);
        } else {
            System.out.println("Ningún dígito es múltiplo del otro.");
        }

        sc.close();
    }
}

class DigitosIguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ejercicio 10 - Ingresa un número de dos dígitos: ");
        int numero = sc.nextInt();
        int d1 = Math.abs(numero) / 10;
        int d2 = Math.abs(numero) % 10;

        if (d1 == d2) {
            System.out.println("Los dígitos son iguales.");
        } else {
            System.out.println("Los dígitos son diferentes.");
        }

        sc.close();
    }
}
