package chapter12;

public class NodePerson {
    private int age;
    private String name;

    private NodePerson next;
    private NodePerson prev;

    public NodePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodePerson getNext() {
        return next;
    }

    public void setNext(NodePerson next) {
        this.next = next;
    }

    public NodePerson getPrev() {
        return prev;
    }

    public void setPrev(NodePerson prev) {
        this.prev = prev;
    }
}
