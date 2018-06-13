package main.java.com.peryomin.ds;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public LinkedList() {
        first = new Node<>(null);
        last = new Node<>(null);
        first.next = last;
        last.prev = first;
    }

    public void addFirst(T value) {
        insertBefore(first.next, new Node<>(value));
    }

    public void addLast(T value) {
        insertBefore(last, new Node<>(value));
    }

    public T getFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.next.value;
    }

    public T getLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return last.prev.value;
    }

    public T removeFirst() {
        return remove(first.next);
    }

    public T removeLast() {
        return remove(last.prev);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void insertBefore(Node<T> pivot, Node<T> node) {
        node.prev = pivot.prev;
        node.next = pivot;
        pivot.prev.next = node;
        pivot.prev = node;
        size++;
    }

    private T remove(Node<T> node) {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        T result = node.value;
        node = node.prev = node.next = null;
        return result;
    }

    private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        Node(T value){
            this.value = value;
        }
    }
}