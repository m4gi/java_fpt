/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mytree;

import java.util.Scanner;

/**
 *
 * @author Le Tuan
 */
public class Main {
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Root at the beginning is " + tree.root);
        TreeNode rootA = tree.insertNode(tree.root, 50);
        System.out.println("Root after insertion is " + rootA.info);
        tree.insertNode(rootA, 30);
        System.out.println("Root after insertion is " + rootA.info);
        System.out.println("Left Root after insertion is " + rootA.left.info);
        tree.insertNode(rootA, 20);
        System.out.println("Left Root after insertion is " + rootA.left.info);
        tree.insertNode(rootA, 40);
        tree.insertNode(rootA, 70);
        System.out.println("Right Root after insertion is " + rootA.right.info);
        tree.insertNode(rootA, 60);
        tree.insertNode(rootA, 80);
        tree.inOder(rootA);
        System.out.print("Search Node 20: ");
        tree.visit(tree.search(rootA, 20));
    }
}
