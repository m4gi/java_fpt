package Mytree;

/**
 *
 * @author Le Tuan
 */
public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    TreeNode insertNode(TreeNode root, int info) {
        TreeNode node = new TreeNode(info);
        if (root == null) {
            root = node;
            return root;
        }
        if (info < root.info) {
            root.left = insertNode(root.left, info);

        } else if (info > root.info) {
            root.right = insertNode(root.right, info);
        }
        return root;
    }

    TreeNode search(TreeNode root, int infox) {
        if (root == null || root.info == infox) {
            return root;
        }
        if (root.info > infox) {
            return search(root.left, infox);
        }
        return search(root.right, infox);
    }

    public void visit(TreeNode p) {
        System.out.println("" + p.info);
    }

    // inorder  traversal: left root right
    public void inOder(TreeNode rootA) {
        if (rootA == null) {
            return;
        }
        inOder(rootA.left);
        visit(rootA);
        inOder(rootA.right);

    }

    public boolean isEmpty() {
        return (root == null);
    }
}
