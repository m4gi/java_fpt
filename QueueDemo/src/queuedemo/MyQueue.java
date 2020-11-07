/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedemo;

public class MyQueue<T> {

    private int front, last, capacity;
    private T[] queue;

    public MyQueue() {
    }

    public MyQueue(int capacity) {
        front = last = 0;
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
    }

    public void enqueue(T data) {
        if (last == capacity) {
            System.out.println("Can not add because queue is full");
        } else {
            System.out.println("Add success");
            queue[last] = data;
            last++;
        }
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public void clear() {
        front = -1;
        last = -1;
        capacity = 0;
    }

    public T dequeue() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Quese is empty");
        } else {
            item = queue[front];
            front++;
            capacity--;
        }
        return item;
    }

    public void display() {
        System.out.println("My Queue data is");
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < last; i++) {
                System.out.println(queue[i]);
            }
            System.out.println("");
        }
    }

    public void first() {
        System.out.println("First element is " + queue[front]);
    }

}
