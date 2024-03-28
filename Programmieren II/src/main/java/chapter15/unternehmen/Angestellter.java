package chapter15.unternehmen;

public class Angestellter {
    String vorname;
    String nachname;
    String identifikator;
    int grundgehalt;
    double gehaltsfaktor = 1;
    String geburtsdatum;
    double gehalt;

    public Angestellter(String vorname, String nachname, String identifikator, int grundgehalt, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.identifikator = identifikator;
        this.grundgehalt = grundgehalt;
        this.geburtsdatum = geburtsdatum;
        this.gehalt = grundgehalt * gehaltsfaktor;
    }
}
