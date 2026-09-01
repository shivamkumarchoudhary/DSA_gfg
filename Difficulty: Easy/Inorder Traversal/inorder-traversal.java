/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {

    public ArrayList<Integer> inOrder(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        inorderTraversal(root, result);

        return result;
    }

    void inorderTraversal(Node root, ArrayList<Integer> result) {

        if (root == null) {
            return;
        }

        // Left
        inorderTraversal(root.left, result);

        // Root
        result.add(root.data);

        // Right
        inorderTraversal(root.right, result);
    }
}