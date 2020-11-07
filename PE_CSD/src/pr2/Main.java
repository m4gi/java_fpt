/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2;

/**
 *
 * @author Magi
 */
public class Main {

    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node10 = new Node(10);
        Node node15 = new Node(15);
        Node node20 = new Node(20);
        Node node25 = new Node(25);
        Node node30 = new Node(30);
        Node node35 = new Node(35);
        Node node40 = new Node(40);
        node5.add(node10);
        node10.add(node15);
        node15.add(node20);
        node10.add(node25);
        node25.add(node35);
        node35.add(node40);
        node25.add(node30);
        System.out.println("Depth-First Search traversal of above graph: ");
        DepthFirst obj = new DepthFirst();
        obj.stack(node5);
    }
}
