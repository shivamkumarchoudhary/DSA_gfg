class Solution {

    public int countNodes(Node root) {
        // code here
        if(root == null){
          return 0;
        }
        
        int countleft = countNodes(root.left);
        int countright = countNodes(root.right);
        int sum = countleft + countright ;
        return sum +1;
    }
}