class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] cache = new int[100001];
        long ans = 0;
        int dup = 0;
        long s = 0;
        int n = nums.length;
        
        for (int i = 0; i < k - 1; i++) {
            s += nums[i];
            if (++cache[nums[i]] == 2) {
                dup++;
            }
        }
        
        for (int i = k - 1; i < n; i++) {
            s += nums[i];
            if (++cache[nums[i]] == 2) {
                dup++;
            }
            if (dup == 0) {
                ans = Math.max(ans, s);
            }
            s -= nums[i-(k-1)];
            if (--cache[nums[i-(k-1)]] == 1)
                dup--;
        }
        return ans;
        
    }
}