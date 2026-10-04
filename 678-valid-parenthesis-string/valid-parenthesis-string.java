class Solution {
    public boolean checkValidString(String s) {

        int n = s.length();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else if(s.charAt(i) == '*'){
                star.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!st.isEmpty()){
            if(star.isEmpty()){
                return false;
            }
            if(st.peek() < star.peek()){
                st.pop();
                star.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}