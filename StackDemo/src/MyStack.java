/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MyStack {

    private int top;
    private String[] storage;
    private Integer[] store;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Stack's capacity must be positive");
        }
        storage = new String[capacity];
        store = new Integer[capacity];
        top = -1;
    }

    public void push(String value) {
        if (top == storage.length) {
            throw new StackOverflowError("Stack's underlying storage is over...");
        }
        top++;
        storage[top] = value;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return null;
        }
        return storage[top];
    }

    public String pop() {
        String tmp = storage[top];
        top--;
        return tmp;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void pushInt(int value) {
        if (top == store.length) {
            throw new StackOverflowError("Stack's underlying storage is over...");
        }
        top++;
        store[top] = value;
    }

    public void converBinary(int n) {
        int val;
        while (n > 0) {
            val = n % 2;
            pushInt(val);
            n /= 2;
        }
    }

    public void travesal() {
        for (int i = top; i >= 0; i--) {
            System.out.print("    " + store[i]);
        }
    }
}
