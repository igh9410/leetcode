class Solution {
    int[][] memo;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new int[m][n];
     
        return findMinPathSum(grid, m - 1, n - 1);
    }
    
    public int findMinPathSum(int[][] grid, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }        
        if (row == 0 && col == 0) {
            return grid[row][col];
        }       
        
        if (memo[row][col] == 0) {
            int fromDown = findMinPathSum(grid, row - 1, col);
            int fromLeft = findMinPathSum(grid, row, col - 1);
            int currentCost = grid[row][col];
            memo[row][col] = Math.min(fromDown, fromLeft) + currentCost;
        }
        return memo[row][col];
    }
}