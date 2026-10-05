class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int score =0;
        int dept=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                dept++;
            }
            else{
                dept--;
                if(s.charAt(i-1)=='('){
                    score += 1 << dept;
                }
            }
        }
        return score;
    }
}