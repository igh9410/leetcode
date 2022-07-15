class Solution {
    int m, n;
    boolean[][] visited;
    
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        
        int maxArea = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j])
                    maxArea = Math.max(maxArea, dfs(grid, i , j));
            }
        }
        return maxArea;
        
    }
    
    public int dfs(int[][] grid, int i, int j) {
           if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1 || visited[i][j]) {
                    return 0;
                }
                visited[i][j] = true;
                return (1 + dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1));
        }   
    
}