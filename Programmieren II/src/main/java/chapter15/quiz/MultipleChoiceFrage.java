package chapter15.quiz;

public class MultipleChoiceFrage extends Frage{
    String[] antworten;

    public MultipleChoiceFrage(String frage, String[] antworten) {
        super(frage);
        this.antworten = antworten;
    }

    @Override
    public void printFrage() {
        String output = "Fragentext:\n" + frage + "\n\nAntwortmöglichkeiten:\n";
        for (int i = 0; i < antworten.length; i++) {
            output += Character.toString('A' + i) + ": " + antworten[i] + "\n";
        }

        System.out.println(output);
    }
}
