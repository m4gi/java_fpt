/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treenode;

/**
 *
 * @author ASUS
 */
public class TreeNode {

    char info;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(char info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

}
