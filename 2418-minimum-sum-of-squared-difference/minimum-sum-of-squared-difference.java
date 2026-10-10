class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long operations = (long) k1 + k2;
        int[] diff = new int[n];

        long total = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            max = Math.max(max, diff[i]);
        }

        if (operations >= total) {
            return 0;
        }

        int left = 0, right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= operations) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        long ans = 0;
        long remainingOps = operations;

        for (int d : diff) {
            if (d > left) {
                remainingOps -= d - left;
                d = left;
            }
            ans += (long) d * d;
        }
        for (int i = 0; i < n && remainingOps > 0; i++) {
            if (diff[i] >= left && diff[i] > 0) {
                ans -= (long) left * left;
                ans += (long) (left - 1) * (left - 1);
                remainingOps--;
            }
        }

        return ans;
    }
}
