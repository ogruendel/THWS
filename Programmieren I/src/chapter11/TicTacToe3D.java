package chapter11;


public class TicTacToe3D {
    public static void main(String[] args) {
        boolean[][][] game = new boolean[3][3][3];
        spielen(game);
        drucken(game);
    }

    public static void spielen(boolean[][][] feld) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    int rand = (int) (Math.random() * 2);

                    feld[x][y][z] = rand != 0;
                }
            }
        }
    }

    public static void drucken(boolean[][][] feld) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    if (feld[x][y][z]) {
                        System.out.print("x ");
                    } else {
                        System.out.print("o ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
