class Solution {
    int[][] memo;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new int[m][n];
        for (int[] row: memo) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
     
        return findMinPathSum(grid, m - 1, n - 1);
    }
    
    public int findMinPathSum(int[][] grid, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        
        if (memo[row][col] != Integer.MAX_VALUE) {
            return memo[row][col];
        }        
        int currentSum = grid[row][col];
        if (row == 0 && col == 0) {
            return currentSum;
        }
        System.out.println(memo[row][col]);
        int fromDown = findMinPathSum(grid, row - 1, col);
        int fromLeft = findMinPathSum(grid, row, col - 1);
        memo[row][col] = currentSum + Math.min(fromDown, fromLeft);
        
        return memo[row][col];
    }
}