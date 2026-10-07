class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int fir= cost[0];
        int sec = cost[1];
        if(n<=2)return Math.min(fir, sec);
        for(int i=2; i<n; i++){
            int cur = cost[i] + Math.min(fir , sec);
            fir = sec;
            sec  = cur;
        }
        return Math.min(fir , sec);
    }
}