/* Structure of Binary Tree Node 
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> kdistance(Node root, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        KdistanceHelper(root, k, result);
        return result;
    }
    void KdistanceHelper(Node root, int k , ArrayList<Integer> result){
        
        if(root == null){
            return ;
        }
        
        if(k == 0 ){
            result.add(root.data);
            return ;
        }
        KdistanceHelper(root.left,k-1,result);
        KdistanceHelper(root.right,k-1,result);
        
        
    }
};