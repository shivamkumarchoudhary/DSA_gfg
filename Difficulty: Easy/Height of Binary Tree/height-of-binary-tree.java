/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
        // code here
        if(root == null){
            return -1;
        }
        int leftheight = height(root.left);
        
        int rightheight = height(root.right);
        
        int max = Math.max(leftheight, rightheight);
         
         return max +1;
        
    }
}