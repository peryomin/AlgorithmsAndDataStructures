package main.java.com.peryomin.ds;

public class DynamicArray<T> {
    private T[] arr;
    private int size = 0;

    public DynamicArray() {
        arr = (T[]) new Object[1];
    }

    public DynamicArray(int arraySize) {
        arraySize = arraySize > 0 ? arraySize : 1;

        arr = (T[]) new Object[arraySize];
    }

    public void add(T item) {
        if (isOutOfBounds()) {
            arrDoubleUp();
        }

        arr[size] = item;
        size++;
    }

    public void add(int index, T item) {
        if (isOutOfBounds(1)) {
            arrDoubleUp();
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = item;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        arr[size] = null;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return arr[index];
    }

    public int getSize() {
        return size;
    }

    private boolean isOutOfBounds() {
        return size == arr.length;
    }

    private boolean isOutOfBounds(int offset) {
        return size + offset == arr.length;
    }

    private void arrDoubleUp() {
        T[] tempArr = arr;
        arr = (T[]) new Object[tempArr.length * 2];
        for (int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }
    }
}
