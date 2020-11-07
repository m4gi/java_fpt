/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treenode;

/**
 *
 * @author Le Tuan
 */
public class Main {

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        TreeNode nodeA = new TreeNode('A');
        TreeNode nodeB = new TreeNode('B');
        TreeNode nodeC = new TreeNode('C');
        TreeNode nodeD = new TreeNode('D');
        TreeNode nodeE = new TreeNode('E');
        TreeNode nodeF = new TreeNode('F');
        TreeNode nodeG = new TreeNode('G');
        TreeNode nodeH = new TreeNode('H');
        TreeNode nodeI = new TreeNode('I');
        myTree.root = nodeF;
        nodeF.left = nodeB;
        nodeF.right = nodeG;
        nodeD.left = nodeA;
        nodeB.right = nodeD;
        nodeD.left = nodeC;
        nodeD.right = nodeE;
        nodeG.right = nodeI;
        nodeI.left = nodeH;
//        myTree.visit(nodeI);
//        System.out.println("");
//        myTree.inOder(myTree.root);
        System.out.println("Breadth First Search :");
        myTree.breath();
        System.out.println("");
        System.out.println("Depth first");
        
    }
}
