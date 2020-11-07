/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeLink;

/**
 *
 * @author Magi
 */
public class TreeNode {
    int info;
    Mytree.TreeNode left;
    Mytree.TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    } 
}
