package chatper11;

public class RoomTest {
    public static void main(String[] args) {
        Raum raum = new Raum("Test", 4, 4, false, 4);
        Student[] students = new Student[]{
                new Student("S", 1),
                new Student("S", 2),
                new Student("S", 3),
                new Student("S", 4),
                new Student("S", 5),
                new Student("S", 6),
                new Student("S", 7)
        };

        System.out.println(raum.createCurrentRoomPlan(true));
        for (int i = 0; i < students.length; i++) {
            raum.betreteRaum(students[i]);
        }
        System.out.println(raum.createCurrentRoomPlan(true));
        printStudentInfo(students, true);
        raum.handsUp(true);
        printStudentInfo(students, true);
    }

    public static void printStudentInfo(Student[] students, boolean withHandInfo) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (withHandInfo) {
                    System.out.println(students[i].getName() + " " + students[i].isHandUp());
                } else {
                    System.out.println(students[i].getName());
                }
            }
        }
    }
}
