class Solution {
    public String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
       res.reverse();

              if (res.length() == 0) {
                  return "-1";
              }

              return res.toString();
    }
}