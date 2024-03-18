package chapter10;

public class Uhr {
    private int stunde;
    private int minute;
    private int sekunde;

    public Uhr(int stunde, int minute, int sekunde) {
        if (stunde >= 24 || minute >= 60 || sekunde >= 60) {
            this.stunde = 12;
            this.minute = 0;
            this.sekunde = 0;
        } else {
            this.stunde = stunde;
            this.minute = minute;
            this.sekunde = sekunde;
        }
    }

    public int getStunde() {
        return this.stunde;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSekunde() {
        return this.sekunde;
    }

    public void setUhr(int stunde, int minute, int sekunde) {
        if (stunde >= 24) {
            System.out.println("Stunde mehr als 24");
        } else {
            this.stunde = stunde;
        }

        if (minute >= 60) {
            System.out.println("Minute mehr als 60");
        } else {
            this.minute = minute;
        }

        if (sekunde >= 60) {
            System.out.println("Sekunde mehr als 60");
        } else {
            this.sekunde = sekunde;
        }
    }

    public void naechsteSekunde() {
        if (this.sekunde == 59) {
            if (this.minute == 59) {
                if (this.stunde == 23) {
                    this.stunde = 0;
                }
                this.minute = 0;
            }
            this.sekunde = 0;
        } else {
            this.sekunde++;
        }
    }
}
