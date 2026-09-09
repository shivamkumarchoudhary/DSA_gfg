/* Structure of a Binary Search Tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}; */

class Solution {
    public Node delNode(Node root, int x) {

        if (root == null) {
            return null;
        }

        // Go right
        if (x > root.data) {
            root.right = delNode(root.right, x);
        }

        // Go left
        else if (x < root.data) {
            root.left = delNode(root.left, x);
        }

        // Node found
        else {

            // No left child
            if (root.left == null) {
                return root.right;
            }

            // No right child
            if (root.right == null) {
                return root.left;
            }

            // Two children
            Node successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.data = successor.data;

            root.right = delNode(root.right, successor.data);
        }

        return root;
    }
}