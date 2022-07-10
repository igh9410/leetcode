class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int start_from_zero = 0;
        int start_from_one = 0;
        for (int i = 2; i <= n; i++) {
            int temp = start_from_zero;
            start_from_zero = Math.min(start_from_zero + cost[i - 1], start_from_one + cost[i-2]);
            start_from_one = temp;
        }
        return start_from_zero;
    }
}