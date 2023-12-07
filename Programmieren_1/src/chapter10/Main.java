package chapter10;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
    }
}
