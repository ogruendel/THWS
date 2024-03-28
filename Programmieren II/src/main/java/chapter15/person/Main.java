package chapter15.person;

public class Main {
    public static void main(String[] args) {
        Person[] personen = new Person[100];

        for (int i = 0; i < 100; i++) {
            Person person;
            if (i % 2 == 0) {
                person = new Student("Programmieren");
            } else {
                person = new Professor("Programmieren");
            }
            personen[i] = person;
        }

        for (int i = 0; i < personen.length; i++) {
            personen[i].gibTaetigkeitAus();
        }
    }
}
