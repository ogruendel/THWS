package chapter15.quiz;

public class Quiz {
    Frage[] fragen;
    public void printQuizBogen() {
        for (int i = 0; i < fragen.length; i++) {
            fragen[i].printFrage();
        }
    }
}
