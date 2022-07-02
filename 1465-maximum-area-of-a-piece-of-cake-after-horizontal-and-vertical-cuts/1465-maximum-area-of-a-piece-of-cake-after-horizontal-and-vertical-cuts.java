class Solution {
    int h, w;
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        this.h = h;
        this.w = w;
        int m = 1000000007;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        
        long maxHeight = calculateHeight(horizontalCuts);
        long maxWidth = calculateWidth(verticalCuts);
        long maxArea = maxHeight * maxWidth;
        System.out.println(maxArea);      
        return (int) (maxArea % m);
    }
    
    public long calculateHeight(int[] horizontalCuts) {
        int startRow = 0;
        int endRow = h;
        int maximumHeight = Integer.MIN_VALUE;
        
        for (int i = 0; i < horizontalCuts.length; i++) {
            int currentRow = horizontalCuts[i];
            int height;
            
            if (i == horizontalCuts.length - 1) {
                height = Math.max(currentRow - startRow, endRow - currentRow);                
            } else {
                height = currentRow - startRow;
            }
            maximumHeight = Math.max(maximumHeight, height);
            startRow = horizontalCuts[i];           
        }
        return maximumHeight;  
    }
    
    public long calculateWidth(int[] verticalCuts) {
        int startColumn = 0;
        int endColumn = w;
        int maximumWidth = Integer.MIN_VALUE;
        
        for (int i = 0; i < verticalCuts.length; i++) {
            int currentColumn = verticalCuts[i];
            int width;
            if (i == verticalCuts.length - 1) {
                width = Math.max(currentColumn - startColumn, endColumn - currentColumn);
            } else {
                width = currentColumn - startColumn;                
            }
            maximumWidth = Math.max(maximumWidth, width);
            startColumn = verticalCuts[i];
        }
        return maximumWidth;
    }
}