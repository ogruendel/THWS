package chatper11;

public class Landscape {
    private final String[][] colorMatrix;

    public Landscape (String[][] colorMatrix) {
        this.colorMatrix = colorMatrix;
    }

    public Point findColor(String color) {
        for (int i = 0; i < this.colorMatrix.length; i++) {
            for (int j = 0; j < this.colorMatrix[i].length; j++) {
                if (colorMatrix[i][j].equals(color)) {
                    return new Point(i, j);
                }
            }
        }
        return new Point(-1, -1);
    }
}
