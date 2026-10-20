class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans =0;
        for(int k=1; k<=n; k++){
            if(n % k !=0){
                continue;
            }
        
        boolean possible = true;
        int prevMax = Integer.MIN_VALUE;

        for(int start=0; start<n; start+=k){
           int count=0;
           int min = Integer.MAX_VALUE;
           int max = Integer.MIN_VALUE;
           for(int j=start; j<start + k; j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
               if (j > start && nums[j - 1] > nums[j]) {
                        count++;
                    }
           }
           if (count > 1 ||
                    (count == 1 && nums[start + k - 1] > nums[start])) {
                    possible = false;
                    break;
                }
                if (prevMax > min) {
                    possible = false;
                    break;
                }
                prevMax = max;
        }
        if(possible){
            ans+=k;
        }
        }
        return ans;
    }
}