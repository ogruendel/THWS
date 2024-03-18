package chapter8;

public class Parameteruebergabe {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Keine zwei Argumente übergeben");
        } else {
            System.out.println(Integer.valueOf(args[0]) * Integer.valueOf(args[1]));
        }
    }
}
