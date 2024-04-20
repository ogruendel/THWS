package chapter16.schach;

public class Brett {
    boolean[][] brett = new boolean[8][8];

    public Brett() {

    }

    public Brett kombiniere(Brett brett) {
        Brett newBrett = new Brett();
        for (int x = 1; x < 8; x++) {
            for (int y = 1; y < 8; y++) {
                if (brett.gibFeld(x, y) || this.brett[x - 1][y - 1]) {
                    newBrett.markiereFeld(x, y);
                }
            }
        }

        return newBrett;
    }

    public void markiereFeld(int x, int y) {
        brett[x - 1][y - 1] = true;
    }

    public boolean gibFeld(int x, int y) {
        return brett[x - 1][y - 1];
    }

}
