package chapter12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Doubly linked list
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

        // Binary Tree
        BinaryTree dictionary = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Menü:\n(1) Einfügen\n(2) Suche\n(3) Löschen\n(4) Exit");

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("Wort zum einfügen: ");
                    String word = scanner.nextLine();
                    System.out.println("Bedeutung des Wortes: ");
                    String description = scanner.nextLine();
                    dictionary.insert(new DictionaryNode(word, description));
                    dictionary.print();
                }
                case 2 -> {
                    System.out.println("Wort zum suchen: ");
                    String word = scanner.nextLine();
                    System.out.println(dictionary.search(word));
                }
                case 3 -> {
                    System.out.println("Wort zum löschen: ");
                    String word = scanner.nextLine();
                    dictionary.delete(dictionary.searchNode(word));
                    dictionary.print();
                }
                case 4 -> {
                    running = false;
                }
                default -> {
                    System.out.println("Falsche Eingabe.");
                }
            }
        }

        scanner.close();
    }
}
