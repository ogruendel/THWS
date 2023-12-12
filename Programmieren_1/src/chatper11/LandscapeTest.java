package chatper11;

public class LandscapeTest {
    public static void main(String[] args) {
        String[][] colors = new String[][] {
                {"red", "blue", "green"},
                {"yellow", "indianred"}
        };
        Landscape landscape = new Landscape(colors);

        Point point = landscape.findColor("indianred");
        System.out.println(point.getX() + " " + point.getY());
    }
}
