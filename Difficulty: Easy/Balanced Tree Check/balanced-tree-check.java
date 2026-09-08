/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return isBalancedrec(root)>0;
        
    }
    
    static int isBalancedrec(Node root){
         if(root == null){
             return 0;
         }
         int lh = isBalancedrec(root.left);
         if(lh == -1) return -1;
         
         int rh = isBalancedrec(root.right);
         if(rh == -1) return -1;
         
         if(Math.abs(lh-rh)>1)return -1;
         else return Math.max(lh,rh)+1;
             
        
    }
}