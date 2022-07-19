class Solution {
    int m, n;
    public boolean searchMatrix(int[][] matrix, int target) {
        m = matrix.length;
        n = matrix[0].length;
        int[] firstCol = new int[m];
        for (int i = 0; i < m; i++) {
            firstCol[i] = matrix[i][0];
        }
        for (int i = 0; i < m; i++) {
            if (binarySearchRow(matrix, target, i)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean binarySearchRow(int[][] matrix, int target, int row) {
        int[] nums = matrix[row];
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }            
        }
        return false;
    }
}