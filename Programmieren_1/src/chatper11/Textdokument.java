package chatper11;

public class Textdokument {
    private char[][] dokument;

    public Textdokument(char[][] dokument) {
        this.dokument = dokument;
    }

    public int zaehleZeichen() {
        int zeichen = 0;

        for (int i = 0; i < dokument.length; i++) {
            if (dokument[i].length != 0) {
                for (int j = 0; j < dokument[i].length; j++) {
                    if (dokument[i][j] != ' ') {
                        zeichen++;
                    }
                }
            }
        }

        return zeichen;
    }

    public boolean vertauscheZeilen(int x, int y) {
        if (x > this.dokument.length - 1 || y > this.dokument.length - 1) {
            return false;
        } else {
            char[] temp = this.dokument[x];
            this.dokument[x] = this.dokument[y];
            this.dokument[y] = temp;
        }
        return true;
    }

    public void fuegeEinTextdokument(char[][] einzufuegen, int pos) {
        if (pos > this.dokument.length - 1) {
            throw new RuntimeException("Position zu groß");
        } else {
            char[][] newDokument = new char[this.dokument.length + einzufuegen.length][];

            for (int i = 0; i < newDokument.length; i++) {
                if (i >= pos) {
                    if (i - pos > einzufuegen.length - 1) {
                        newDokument[i] = this.dokument[i - einzufuegen.length];
                    } else {
                        newDokument[i] = einzufuegen[i - pos];
                    }
                } else {
                    newDokument[i] = this.dokument[i];
                }
            }
            this.dokument = newDokument;
        }
    }
    public char[][] getText() {
        return this.dokument;
    }
}
