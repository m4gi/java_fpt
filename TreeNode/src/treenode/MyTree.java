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
public class MyTree {

    TreeNode root;

    public MyTree() {
        this.root = null;
    }

    public MyTree(char value) {
        TreeNode root = new TreeNode(value);
        this.root = root;
    }

    public void visit(TreeNode p) {
        System.out.println("" + p.info);
    }

    // inorder  traversal: left root right
    public void inOder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOder(node.left);
        visit(node);
        inOder(node.right);

    }
    // post order  traversal : left right root

    public void postOder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOder(node.left);
        inOder(node.right);
        visit(node);

    }
    // pre order traversal: root left right

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        visit(node);
        inOder(node.left);
        inOder(node.right);

    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.info + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    void breath() {
        int h = height(root);
        int i;
        for (i = 0; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }
}