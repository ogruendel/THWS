package chapter14;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort) {
        if (vorname.charAt(0) < 'A' || vorname.charAt(0) > 'Z') {
            throw new RuntimeException("Vorname muss mit einem Großbuchstaben beginnen");
        } else {
            this.vorname = vorname;
        }

        if (nachname.charAt(0) < 'A' || nachname.charAt(0) > 'Z') {
            throw new RuntimeException("Nachname muss mit einem Großbuchstaben beginnen");
        } else {
            this.nachname = nachname;
        }

        this.adresse = new Adresse();
        this.adresse.strasse = strasse;

        if (hausnummer.charAt(0) < '0' || hausnummer.charAt(0) > '9') {
            throw new RuntimeException("Hausnummer muss mit einer Ziffer beginnen");
        } else {
            this.adresse.hausnummer = hausnummer;
        }

        this.adresse.postleitzahl = postleitzahl;

        if (ort.charAt(0) < 'A' || ort.charAt(0) > 'Z') {
            throw new RuntimeException("Ort muss mit einem Großbuchstaben beginnen");
        } else {
            this.adresse.ort = ort;
        }
    }
}
