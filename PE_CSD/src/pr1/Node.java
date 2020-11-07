/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1;

/**
 *
 * @author Magi
 */
public class Node<T> {

    Node previous;
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public Node(Node previous, int data, Node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
