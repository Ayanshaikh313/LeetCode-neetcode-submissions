class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int level =0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                level++;
                if(level >1)result.append('(');
            }
            else{
                level--;
                if(level >0)result.append(')');
            }
        }
        return result.toString();
    }
}