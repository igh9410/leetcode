class Solution {
    public void rotate(int[] nums, int k) {
        Map<Integer, Integer> rotationMap = new HashMap<>();
        int n = nums.length;
        
        if (n < k) {
            k = k % n;
        }
        for (int i = 0; i < n; i++) {
            int position = i + k;
            if (position < n) {
                rotationMap.put(position, nums[i]);
            } else {
                rotationMap.put(position - n, nums[i]);
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            nums[i] = rotationMap.get(i);
        }
        
    }
}