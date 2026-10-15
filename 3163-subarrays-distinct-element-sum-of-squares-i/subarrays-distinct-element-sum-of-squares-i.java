class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int uniqS = 0;
            for (int j = i; j < n; j++) {
                boolean seen = false;
                for (int k = i; k < j; k++) {
                    if (nums.get(k).equals(nums.get(j))) {
                        seen = true;
                        break;
                    }
                }
                if (!seen) uniqS++;        
                ans += uniqS * uniqS;
            }
        }
        return ans;
    }
}