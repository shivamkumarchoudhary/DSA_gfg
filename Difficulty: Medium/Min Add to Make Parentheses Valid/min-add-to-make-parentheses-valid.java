class Solution {
    public int minParentheses(String s) {
        // code here
      Stack<Character> st  = new Stack<>();
      int open =0;
      int close =0;
      for(char ch: s.toCharArray()){
          if(ch == '('){
              open++;
          }
          else{
              if(open>0){
                  open--;
              }
              else{
                  close++;
              }
          }
      }
      
      return open+close;
        
    }
}
