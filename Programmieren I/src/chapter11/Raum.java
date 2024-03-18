package chapter11;

public class Raum {
    private final String name;
    private boolean belegt;

    private final int LAENGE;
    private final int BREITE;
    private Student[][] studenten;

    public Raum(String name, int laenge, int breite, boolean belegt, int row) {
        this.name = name;
        this.LAENGE = laenge;
        this.BREITE = breite;
        this.belegt = belegt;
        this.studenten = createRoom(row);
    }

    private Student[][] createRoom(int row) {
        Student[][] room = new Student[this.LAENGE][];
        int multiplier = 1;
        for (int i = 0; i < this.LAENGE; i++) {
            if (i >= row) {
                room[i] = new Student[this.BREITE + multiplier * 2];
                multiplier++;
            } else {
                room[i] = new Student[this.BREITE];
            }
        }
        return room;
    }

    public boolean getBelegt() {
        return this.belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public int getMaxPlaetze() {
        return this.LAENGE * this.BREITE;
    }

    public String getName() {
        return name;
    }

    public Student[][] getStudenten() {
        return studenten;
    }

    public void setStudenten(Student[][] studenten) {
        this.studenten = studenten;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void betreteRaum(Student student) {
        boolean voll = true;
        for (int i = 0; i < this.LAENGE; i++) {
            for (int j = 0; j < this.BREITE; j++) {
                if (this.studenten[i][j] == null && voll) {
                    voll = false;
                    this.studenten[i][j] = student;
                    break;
                }
            }
        }
        if (voll) {
            System.out.println("Kein Platz mehr");
        }
    }

    public void verlasseRaum(Student student) {
        for (int i = 0; i < this.LAENGE; i++) {
            for (int j = 0; j < this.BREITE; j++) {
                if (this.studenten[i][j] == student) {
                    this.studenten[i][j] = null;
                }
            }
        }

    }

    public void alleStudenten() {
        for (int i = 0; i < this.LAENGE; i++) {
            for (int j = 0; j < this.BREITE; j++) {
                if (this.studenten[i][j] != null) {
                    System.out.println("Name: " + studenten[i][j].getName() + "\tMatrikel Nr: " + studenten[i][j].getMatrikelNr());
                }
            }
        }
    }

    public String createCurrentRoomPlan(boolean showEmptyChair) {
        String output = "";
        int maxBreite = this.studenten[this.LAENGE - 1].length;

        for (int i = 0; i < this.studenten.length; i++) {

            for (int k = 0; k < (maxBreite - this.studenten[i].length) / 2; k++) {
                output += "   ";
            }

            for (int j = 0; j < this.studenten[i].length; j++) {
                if (this.studenten[i][j] == null) {
                    if (showEmptyChair) {

                        output += "__ ";
                    }
                } else {
                    output += studenten[i][j].getName().charAt(0) + "" + String.valueOf(studenten[i][j].getMatrikelNr()).charAt(0) + " ";
                }
            }
            output += "\n";
        }
        return output;
    }

    public int getLAENGE() {
        return LAENGE;
    }

    public int getBREITE() {
        return BREITE;
    }

    public void handsUp(boolean value) {
        for (int i = 0; i < this.studenten.length; i++) {
            for (int j = 0; j < this.studenten[i].length; j++) {
                if (this.studenten[i][j] != null) {
                    this.studenten[i][j].setHandUp(value);
                }
            }
        }
    }

    public void handsUp(boolean value, Student student) {
        for (int i = 0; i < this.studenten.length; i++) {
            for (int j = 0; j < this.studenten[i].length; j++) {
                if (this.studenten[i][j] == student) {
                    this.studenten[i][j].setHandUp(value);
                }
            }
        }
    }
}
