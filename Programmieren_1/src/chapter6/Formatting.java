package chapter6;

public class Formatting {
    public static void main(String[] args) {
        System.out.println(formatName("John", "Doe"));
        System.out.println(formatNameWithMatriculationNr("John", "Doe", 5011111));
        System.out.println(formatNameWithMatriculationNrAndMail("John", "Doe", 5011111, "john.doe@stuent.fhws.de"));
    }

    public static String formatName(String firstName, String secondName) {
        return firstName + ", " + secondName;
    }

    public static String formatNameWithMatriculationNr(String firstName, String secondName, int matriculationNr) {
        return formatName(firstName, secondName) + " (" + matriculationNr + ")";
    }

    public static String formatNameWithMatriculationNrAndMail(String firstName, String secondName, int matriculationNr, String email) {
        return formatNameWithMatriculationNr(firstName, secondName, matriculationNr) + ": " + email;
    }
}
