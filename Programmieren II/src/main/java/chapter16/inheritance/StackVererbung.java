package chapter16.inheritance;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList {
    public void push(Object e) {
        super.add(e);
    }

    public Object pop() {
        return super.remove(super.size() - 1);
    }
}
