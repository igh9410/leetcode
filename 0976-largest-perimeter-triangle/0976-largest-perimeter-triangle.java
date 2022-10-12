class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int longestLength = nums[nums.length - 1];
        int result = 0;
        
        for (int i = nums.length - 1; i >= 2; i--) {
            int first = nums[i - 2];
            int second = nums[i - 1];
            if (longestLength >= first + second) {
                longestLength = second;
                continue;
            }
            else {
                result = first + second + longestLength;
                break;
            }    
        }
        
        return result;
    }
}