package chapter12;

public class Lotto {
    public static void main(String[] args) {
        int size = 49;
        SinglyLinkedList lottozahlen = new SinglyLinkedList();

        for (int i = 1; i <= 49; i++) {
            lottozahlen.addNode(lottozahlen, i);
        }

        for (int i = 0; i < 6; i++) {
            Node zahl = lottozahlen.head;
            Node prev = lottozahlen.head;

            int offset = (int) (Math.random() * size);

            while (offset != 0) {
                prev = zahl;
                zahl = zahl.getNext();
                offset--;
            }

            prev.setNext(zahl.getNext());
            size = size - 1;
            System.out.println(zahl.getValue());
        }
    }
}