//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println(empiezaconminusc("Rafaelina"));
}
       public static boolean empiezaconminusc(String s) {
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
}