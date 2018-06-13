package main.java.com.peryomin.ds;

public class Stack<T> {
    private T[] arr;
    private int size = 0;

    public Stack() {
        arr = (T[]) new Object[1];
    }

    public Stack(int stackSize) {
        stackSize = stackSize > 0 ? stackSize : 1;
        arr = (T[]) new Object[stackSize];
    }

    public void push(T item) {
        if (isOutOfBounds()) {
            arrDoubleUp();
        }
        arr[size] = item;
        size++;
    }

    public T pop() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        T result = arr[size - 1];
        size--;
        arr[size] = null;
        return result;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isOutOfBounds() {
        return size == arr.length;
    }

    private void arrDoubleUp() {
        T[] tempArr = arr;
        arr = (T[]) new Object[tempArr.length * 2];
        for (int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }
    }
}