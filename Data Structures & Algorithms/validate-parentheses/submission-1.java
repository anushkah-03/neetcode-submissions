class Solution {
    public boolean isValid(String s) {
        java.util.Stack<Character> st = new java.util.Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(')');
            }
            else if(ch=='{'){
                st.push('}');
            }
            else if(ch=='['){
                st.push(']');
            }
            else{
                if(st.isEmpty() || st.pop()!=ch){
                    return false;
                }
            }
        }
     return st.isEmpty();   
    }
}