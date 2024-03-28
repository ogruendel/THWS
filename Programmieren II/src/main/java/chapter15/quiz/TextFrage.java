package chapter15.quiz;

public class TextFrage extends Frage {
    public TextFrage(String frage) {
        super(frage);
    }

    @Override
    public void printFrage() {
        String output = frage + "\n\n" + "Antwort:\n" + "\n\n\n\n";
        System.out.println(output);
    }
}
