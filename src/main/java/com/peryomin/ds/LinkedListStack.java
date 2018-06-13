package main.java.com.peryomin.ds;

import java.util.EmptyStackException;
import main.java.com.peryomin.ds.LinkedList;

public class LinkedListStack <T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T value) {
        list.addLast(value);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}