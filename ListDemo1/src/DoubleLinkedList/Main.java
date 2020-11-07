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
public class Main {

    public static void main(String[] args) {
        Customer cs1 = new Customer("d1", "");
        Customer cs2 = new Customer("d2", "Quang");
        Customer cs3 = new Customer("d3", "Nhan");
        Customer cs4 = new Customer("d4", "Magi");
        Customer cs5 = new Customer("d5", "Shiro");
        Customer cs6 = new Customer("d6", "Anh");
        Node nodeA = new Node(cs1);
        Node nodeB = new Node(cs2);
        Node nodeC = new Node(cs3);
        Node nodeD = new Node(cs4);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        MyDoublyLinkedList mdl = new MyDoublyLinkedList(nodeA, nodeD);
        Customer cs0 = new Customer("d0", "Tuan");
        mdl.addF(cs0);
        mdl.addL(cs5);
        mdl.insert(cs6, 3);
        mdl.display();
        mdl.size();
        mdl.deleteF();
        mdl.deleteL();
        mdl.display();
        mdl.search(cs4);
    }
}
