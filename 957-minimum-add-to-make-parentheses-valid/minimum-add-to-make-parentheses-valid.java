class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int open =0; 
        int add =0;
        char[] c = s.toCharArray();
        for(int i=0; i<n; i++ ){
            if(c[i] == '('){
                open++;
            }
            else{
                if(open >0){
                    open --;
                }
                else{
                    add++;
                }
            }
        }
        return open + add;
    }
}