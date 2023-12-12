package chapter11;

public class Ticker {
    private char[] nachricht;

    public Ticker(int groesse) {
        this.nachricht = new char[groesse > 0 ? groesse : 200];
        fill();
    }

    private void fill() {
        resetNachricht(' ');
    }

    public int getGroesse() {
        return this.nachricht.length;
    }

    public void setNachricht(char[] nachricht) {
        for (int i = 0; i < this.nachricht.length; i++) {
            if (i < nachricht.length) {
                this.nachricht[i] = nachricht[i];
            } else {
                this.nachricht[i] = '+';
            }
        }
    }

    public char[] getNachricht() {
        return this.nachricht;
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = zeichen;
        }
    }

    public void resetNachricht() {
        resetNachricht('+');
    }

    public void rotateNachricht(int distance) {
        if (distance < this.nachricht.length || distance > 0) {
            char[] newNachricht = new char[this.nachricht.length];

            for (int i = 0; i < this.nachricht.length; i++) {
                if (distance + i < this.nachricht.length) {
                    newNachricht[i] = this.nachricht[distance + i];
                } else {
                    newNachricht[i] = this.nachricht[this.nachricht.length - i - 1];
                }
            }

            this.nachricht = newNachricht;
        }
    }
}
