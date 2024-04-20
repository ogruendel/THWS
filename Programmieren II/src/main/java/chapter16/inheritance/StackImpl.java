package chapter16.inheritance;

import java.util.ArrayList;

public class StackImpl implements Stack {
    ArrayList<Object> list = new ArrayList<>();

    @Override
    public Object pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public void push(Object e) {
        list.add(e);
    }
}
