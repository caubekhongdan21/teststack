package ex1;

import java.lang.reflect.Array;

public class Stack<T> {
    private int size;
    private int capacity;
    private T[] data;


    public Stack(int capacity, Class<T> t) {
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

    public void push(T t) {
        if (!isFull()) {
            data[size++] = t;
        } else {
            System.out.println("Stack đã đầy. Không thể thêm mới phần tử.");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            data[size--] = null;
        } else {
            System.out.println("Stack rỗng.");
        }
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
