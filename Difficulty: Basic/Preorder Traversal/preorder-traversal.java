/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {

    public ArrayList<Integer> preOrder(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        preOrdertranversal(root, result);

        return result;
    }

    void preOrdertranversal(Node root, ArrayList<Integer> result) {

        // Base case
        if (root == null) {
            return;
        }

        // Root
        result.add(root.data);

        // Left
        preOrdertranversal(root.left, result);

        // Right
        preOrdertranversal(root.right, result);
    }
}