class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];

        int depth = 0;
        int i = 0;

        while (i < n) {

            if (seq.charAt(i) == '(') {
                depth++;
                ans[i] = depth % 2;
            } 
            else {
                ans[i] = depth % 2;
                depth--;
            }

            i++;
        }

        return ans;
    }
}