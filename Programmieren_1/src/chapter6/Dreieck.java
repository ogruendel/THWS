package chapter6;

public class Dreieck {
    public static void main(String[] args) {
        System.out.println(dreieck(5));
    }

    public static String dreieck(int x) {
        String line = "";
        String spacer = "";
        String dreieck = "";

        for (int i = 0; i < x; i++) {
            for (int j = x - 1 - i; j > 0; j--) {
                spacer += " ";
            }
            line += "* ";
            dreieck += spacer + line + "\n";
            spacer = "";
        }

        return dreieck;
    }
}
