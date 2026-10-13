class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = (long)nums[i] * nums[i]; 
        }
        Arrays.sort(a);

        int k = nums.length / 2 ;
        long ans =0;

        for(int i=0; i<k; i++){
            ans -= a[i];
        }

        for(int i=k; i<n; i++){
            ans += a[i] ;
        }
        return ans;
    }
}