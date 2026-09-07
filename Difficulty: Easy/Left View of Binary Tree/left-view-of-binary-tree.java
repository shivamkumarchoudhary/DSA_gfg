/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
     ArrayList<Integer> result = new ArrayList<>();
     leftviewHelper(root,0,result);
     return result;
     
    }
    void leftviewHelper(Node root, int level, ArrayList<Integer> result){
        if(root == null){
            return; 
        }
        
        if(level == result.size()){
            result.add(root.data);
        }
        
        leftviewHelper(root.left, level + 1, result);
               leftviewHelper(root.right, level + 1, result);
        
    }
}