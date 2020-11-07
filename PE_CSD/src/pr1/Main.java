/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1;

import java.util.ArrayList;

/**
 *
 * @author Magi
 */
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("List :");
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(12);
        list.addLast(19);
        list.display();
        Node p = new Node(12);
        System.out.println("\nList after addBefore:");
        list.insertBefore(p, 122);
        list.display();
        System.out.println("\nTo array :");
        int[] a = list.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
