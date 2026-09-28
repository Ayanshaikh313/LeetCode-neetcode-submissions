class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }
            else if(s.charAt(i) == ')'){
                st.pop();
            }
            ans = Math.max(ans , st.size());
        }
        return ans; 
    }
}