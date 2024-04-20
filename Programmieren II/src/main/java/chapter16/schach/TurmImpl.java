package chapter16.schach;

public class TurmImpl extends AbstractFigur implements Turm {
    public TurmImpl(int x, int y) {
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        for (int i = 1; i <= 8; i++) {
            brett.markiereFeld(i, y);
            brett.markiereFeld(x, i);
        }
        return brett;
    }

    public static void main(String[] args) {
        TurmImpl turm = new TurmImpl(4, 5);
        Brett brett = turm.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++) {
            for (int i = 1; i <= 8; i++) {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
