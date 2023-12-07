package chapter10;

public class Student {
    private final String name;
    private final int matrikelNr;

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
}
