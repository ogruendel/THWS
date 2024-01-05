package chapter12;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        NodePerson person1 = new NodePerson(41, "Smith");
        NodePerson person2 = new NodePerson(20, "Miller");
        NodePerson person3 = new NodePerson(36, "Jones");
        NodePerson person4 = new NodePerson(10, "Davis");
        NodePerson person5 = new NodePerson(59, "Taylor");

        list.addSortedAge(person1);
        list.addSortedAge(person2);
        list.addSortedAge(person3);
        list.addSortedAge(person4);
        list.addSortedAge(person5);

        NodePerson pointer = list.getHead();
        NodePerson oldPointer = pointer;
        while (pointer != null) {
            System.out.println(pointer.getName());
            oldPointer = pointer;
            pointer = pointer.getNext();
        }
        pointer = oldPointer;
        System.out.println();
        while (pointer != null) {
            System.out.println(pointer.getName());
            pointer = pointer.getPrev();
        }
    }
}
