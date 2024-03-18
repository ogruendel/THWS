package chapter12;

public class SinglyLinkedList {
    Node head;

    public void addNode(SinglyLinkedList list, int value) {
        Node node = new Node(value);
        if (list.head == null) {
            list.head = node;
        } else {
            Node previous = list.head;
            while (previous.getNext() != null) {
                previous = previous.getNext();
            }

            previous.setNext(node);
        }
    }
}
