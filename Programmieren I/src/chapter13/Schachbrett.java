package chapter13;

public class Schachbrett {
    boolean[][] brett = new boolean[8][8];


    public void setzeTurm(int x, int y) {
        for (int i = 0; i < 8; i++) {
            this.brett[x][i] = true;
            this.brett[i][y] = true;
        }
    }

    public String toString() {
        String output = "";
        String line = "";
        for (int i = 0; i < 8; i++) {
            line = "";
            for (int j = 0; j < 8; j++) {
                line = this.brett[i][j] ? line + "x " : line + "o ";
            }
            line = line.substring(0, line.length() - 1);
            output += line + "\n";
        }

        return output;
    }

    public void setBrett(boolean[][] brett) {
        this.brett = brett;
    }

    public boolean[][] getBrett() {
        return this.brett;
    }
}
