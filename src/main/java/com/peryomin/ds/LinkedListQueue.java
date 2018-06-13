package main.java.com.peryomin.ds;

import java.util.EmptyStackException;
import main.java.com.peryomin.ds.LinkedList;

public class LinkedListQueue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T value) {
        list.addLast(value);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}