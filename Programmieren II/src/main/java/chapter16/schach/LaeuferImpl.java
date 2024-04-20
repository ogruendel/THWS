package chapter16.schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer {
    public LaeuferImpl(int x, int y) {
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        for (int offset = -7; offset < 7; offset++) {
            if (x + offset >= 1 && x + offset <= 8) {
                if (y + offset >= 1 && y + offset <= 8) {
                    brett.markiereFeld(x + offset, y + offset);
                }
                if (y - offset >= 1 && y - offset <= 8) {
                    brett.markiereFeld(x + offset, y - offset);
                }
            }
        }

        return brett;
    }

    public static void main(String[] args) {
        LaeuferImpl l = new LaeuferImpl(4, 5);
        Brett brett = l.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++) {
            for (int i = 1; i <= 8; i++) {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
