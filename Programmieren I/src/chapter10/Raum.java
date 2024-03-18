package chapter10;

public class Raum {
    private final String name;
    private final int maxPlaetze;
    private boolean belegt;

    private Student[] studenten;

    public Raum(String name, int plaetze, boolean belegt) {
        this.name = name;
        this.maxPlaetze = plaetze;
        this.belegt = belegt;
        this.studenten = new Student[0];
    }

    public boolean getBelegt() {
        return this.belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public int getMaxPlaetze() {
        return maxPlaetze;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudenten() {
        return studenten;
    }

    public void setStudenten(Student[] studenten) {
        this.studenten = studenten;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void betreteRaum(Student student) {
        if (this.studenten.length < this.maxPlaetze) {

            Student[] studenten = new Student[this.studenten.length + 1];

            for (int i = 0; i < this.studenten.length; i++) {
                studenten[i] = this.studenten[i];
            }
            studenten[studenten.length - 1] = student;

            this.studenten = studenten;
        } else {
            System.out.println("Kein Platz mehr");
        }
    }

    public void verlasseRaum(Student student) {
        boolean gefunden = false;
        Student[] studenten = new Student[this.studenten.length - 1];

        for (int i = 0; i < this.studenten.length; i++) {
            if (this.studenten[i] != student && !gefunden) {
                studenten[i] = this.studenten[i];
            } else if (gefunden) {
                studenten[i - 1] = this.studenten[i];
            } else {
                gefunden = true;
            }
        }

        this.studenten = studenten;
    }

    public void alleStudenten() {
        if (studenten.length != 0) {
            for (int i = 0; i < studenten.length; i++) {
                System.out.println("Name: " + studenten[i].getName() + "\tMatrikel Nr: " + studenten[i].getMatrikelNr());
            }
            System.out.println();
        }
    }
}
