class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = (right - left) * currentHeight;
            max = Math.max(max, currentArea);
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
        
    }
}