package chapter11;

public class Student {
    private final String name;
    private final int matrikelNr;

    private boolean handUp;

    public Student(String name, int matrikelNr) {
        this.name = name;
        this.matrikelNr = matrikelNr;
    }

    public String getName() {
        return name;
    }
    
    public int getMatrikelNr() {
        return matrikelNr;
    }

    public boolean isHandUp() {
        return handUp;
    }

    public void setHandUp(boolean handUp) {
        this.handUp = handUp;
    }
}
