/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int[] ans = new int[1];

        height(root, ans);

        return ans[0];
    }

    int height(Node root, int[] ans) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left, ans);
        int rh = height(root.right, ans);

        // Diameter passing through current node
        ans[0] = Math.max(ans[0], lh + rh);

        // Return height to parent
        return Math.max(lh, rh) + 1;
    }
}