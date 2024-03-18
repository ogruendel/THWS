package chapter12;

public class DoublyLinkedList {
    private NodePerson head;

    public void addSortedAge(NodePerson nodePerson) {
        // This does not feel like a good way of doing things, but I have nothing better atm... might revisit

        NodePerson temp = this.head;
        NodePerson oldTemp = null;

        while (temp != null) {
            if (temp.getAge() > nodePerson.getAge()) {
                break;
            }
            oldTemp = temp;
            temp = temp.getNext();
        }

        if (temp == this.head) {
            if (temp != null) {
                nodePerson.setNext(temp);
                temp.setPrev(nodePerson);
            }
            this.head = nodePerson;
        } else if (temp != null) {
            nodePerson.setNext(temp);
            if (temp.getPrev() != null) {
                nodePerson.setPrev(temp.getPrev());
                temp.getPrev().setNext(nodePerson);
            }
            temp.setPrev(nodePerson);
        } else {
            if (oldTemp.getAge() < nodePerson.getAge()) {
                nodePerson.setPrev(oldTemp);
                oldTemp.setNext(nodePerson);
            } else {
                nodePerson.setNext(oldTemp);
                nodePerson.setPrev(oldTemp.getPrev());
                oldTemp.getPrev().setNext(nodePerson);
                oldTemp.setPrev(nodePerson);
            }
        }
    }

    public NodePerson findByName(String name) {
        NodePerson person = head;

        while (person != null) {
            if (person.getName().equals(name)) {
                return person;
            } else {
                person = person.getNext();
            }
        }

        return person;
    }

    public NodePerson getHead() {
        return head;
    }

    public void setHead(NodePerson head) {
        this.head = head;
    }
}
