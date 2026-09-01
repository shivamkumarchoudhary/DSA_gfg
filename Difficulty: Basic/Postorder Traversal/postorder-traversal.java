/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
     ArrayList<Integer> result = new ArrayList<>();
     tranverpostOrder(root,result);
     return result;
    }
    void tranverpostOrder(Node root, ArrayList<Integer> result){
        if(root == null){
            return ;
        }
        tranverpostOrder(root.left, result);
        
        tranverpostOrder(root.right, result);
        
        result.add(root.data);
    }
    
}