class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return findPath(grid, dp, grid.length-1, grid[0].length-1);
        
    }
    
    public int findPath(int[][] grid, int[][] dp, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) { // BASE CASE: reached the bottom-right corner
            return grid[row][col];
        } 
        if (dp[row][col] == 0) {           
        
            int c1 = findPath(grid, dp, row - 1, col); // From up to down
            int c2 = findPath(grid, dp, row, col - 1); // from left to right
            int currentCost = grid[row][col];
            dp[row][col] = Math.min(c1, c2) + currentCost;
        }
        return dp[row][col];
    }
}