package chapter15.quiz;

public abstract class Frage {
    String frage;
    public Frage(String frage) {
        this.frage = frage;
    }

    public abstract void printFrage();
}
