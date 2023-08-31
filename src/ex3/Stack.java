package ex3;

import java.lang.reflect.Array;

public class Stack<T> {
    private int size;
    private int capacity;
    private T[] data;

    public Stack() {
        this.size = 0;
        this.capacity = 10;
        this.data = (T[]) Array.newInstance(Object.class, capacity);
    }

    public Stack(Class<T> t) {
        this.size = 0;
        this.capacity = 10;
        this.data = (T[]) Array.newInstance(t, capacity);
    }

    public Stack(Class<T> t, int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.data = (T[]) Array.newInstance(t, capacity);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T x) {
        if (!isFull()) {
            data[size++] = x;
        } else {
            System.out.println("False");
        }
    }


    public T pop() {
        if (!isEmpty()) {
            var val =  data[size-1];
            data[size-1] = null;
            size--;
            return val;
        }
        return null;
    }

    public T peek() {
        if (!isEmpty()) {
            return data[size - 1];
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public T[] getData() {
        return data;
    }
}
