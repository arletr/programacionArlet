public class EjercicioError10 {

    static String domingoDePascua(int año) {
        var a = año % 19;
        var b = año / 100;
        var c = año % 100;
        var d = b / 4;
        var e = b % 4;
        var g = ((8 * b) + 13) / 25;
        var h = ((19 * a) + b - d - g + 15) % 30;
        var i = c / 4;
        var k = c % 4;
        var l = (32 + (2 * e) + (2 * i) - h - k) % 7;
        var m = (a + (11 * h) + (19 * l)) / 433;
        var n = (h + l - (7 * m) + 90) / 25;
        var p = (h + l - (7 * m) + (33 * n) + 19) % 32;
        return String.format("%d/%02d/%02d", año, n, p);
    }

    public static void main(String[] args) {
        System.out.println(domingoDePascua(2024));
        System.out.println(domingoDePascua(2025));
        System.out.println(domingoDePascua(2023));
        System.out.println(domingoDePascua(2026));
    }
}