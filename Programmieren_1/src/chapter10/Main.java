package chapter10;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        Raum i215 = new Raum("I.2.15", 32, false);
        Raum i21 = new Raum("I.2.1", 40, false);

        Student student1 = new Student("Name1", 11111);
        Student student2 = new Student("Name2", 22222);
        Student student3 = new Student("Name3", 33333);
        Student student4 = new Student("Name4", 44444);

        i21.alleStudenten();
        i21.betreteRaum(student1);
        i21.betreteRaum(student2);
        i21.betreteRaum(student3);
        i21.alleStudenten();
        i21.verlasseRaum(student1);
        i21.alleStudenten();

        // Aufgabe 2
        Uhr[] weltzeit = new Uhr[]{
                new Uhr(0, 23, 7),
                new Uhr(1, 23, 7),
                new Uhr(2, 23, 7),
                new Uhr(3, 23, 7),
                new Uhr(4, 23, 7),
                new Uhr(5, 23, 7),
                new Uhr(6, 23, 7),
                new Uhr(7, 23, 7),
                new Uhr(8, 23, 7),
                new Uhr(9, 23, 7),
                new Uhr(10, 23, 7),
                new Uhr(11, 23, 7),
                new Uhr(12, 23, 7),
                new Uhr(13, 23, 7),
                new Uhr(14, 23, 7),
                new Uhr(15, 23, 7),
                new Uhr(16, 23, 7),
                new Uhr(17, 23, 7),
                new Uhr(18, 23, 7),
                new Uhr(19, 23, 7),
                new Uhr(20, 23, 7),
                new Uhr(21, 23, 7),
                new Uhr(22, 23, 7),
                new Uhr(23, 23, 7)
        };

        for (int i = 0; i < weltzeit.length; i++) {
            weltzeit[i].naechsteSekunde();
        }
    }
}
