class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        if(sum > 9 * num){
            return "";
        }
        while(num -- >0){
            int digit = Math.min(9 ,sum);
            ans.append(digit);
            sum -= digit;
        }
        return sum ==0 ? ans.toString():"";
    }
}