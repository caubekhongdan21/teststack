package ex2;

import java.lang.reflect.Array;

public class Stack<T> {
    private int size;
    private int capacity;
    private T[] data;

    public Stack() { // hàm tạo mặc định
        size = 0;
        capacity = 10;
        data = (T[]) Array.newInstance(Object.class, capacity);
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

    public T pop() {
        if (!isEmpty()) {
            var val = data[size - 1];
            data[size - 1] = null;
            size--;
            return val;
        } else {
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return data[size - 1];
        }
        return null;
    }

    public void push(T t) {
        if (!isFull()) {
            data[size++] = t;
        } else {
            System.out.println("False");
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
