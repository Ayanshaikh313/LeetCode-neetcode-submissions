class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int even = 1; 
        int odd = 0;
        int sum = 0;
        long cnt = 0;
        for(int x : arr){
            sum +=x;
            if(sum % 2 ==0){
                cnt += odd;
                even++;
            }
            else{
                cnt += even;
                odd++;
            }
            cnt %= MOD;
        }
        return (int)cnt;
    }
}