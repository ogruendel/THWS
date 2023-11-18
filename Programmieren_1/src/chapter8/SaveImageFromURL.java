package chapter8;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
public class SaveImageFromURL {
    public static void main(String[] args) throws IOException {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";
        URL url = new URL(seite.substring(seite.indexOf("http"), seite.indexOf("svg.png") + 7));

        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("image.png"));
    }
}