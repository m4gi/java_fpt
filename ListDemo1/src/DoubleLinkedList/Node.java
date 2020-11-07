/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author ASUS
 */
public class Node {

//    int data;
//    Node next;
//    Node previous;
//
//    public Node() {
//    }
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//        this.previous = null;
//    }
//
//    public Node(int data, Node next) {
//        this.data = data;
//        this.next = next;
//        this.previous = null;
//    }
//
//    public Node(int data, Node next, Node previous) {
//        this.data = data;
//        this.next = next;
//        this.previous = previous;
//    }
    Customer data;
    Node next;

    public Node() {
    }

    public Node(Customer data) {
        this.data = data;
        this.next = next;
    }

    public Node(Customer data, Node next) {
        this.data = data;
        this.next = next;
    }
}
