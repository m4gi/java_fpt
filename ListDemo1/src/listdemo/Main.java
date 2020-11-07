/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdemo;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Node nodeA = new Node(5);
        Node nodeB = new Node(4);
        Node nodeC = new Node(11);
        Node nodeD = new Node(4);
        Node nodeE = new Node(99);
        MyLinkedList mll = new MyLinkedList();
        mll.head = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = mll.tail;

        mll.Display();

        System.out.println("\n####################");
        mll.insertAfterPosition(55, 3);
        mll.Display();
    }

}
