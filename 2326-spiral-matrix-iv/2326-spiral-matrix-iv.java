/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int height = m;
        int width = n;
        
        int[][] result = new int[m][n];
     
        for (int[] i: result)
            Arrays.fill(i, -1);
        
        int top = 0, left = 0, right = n - 1, bottom = m - 1;
        int dir = 0;
        Deque<Integer> qu = new ArrayDeque<>();
        
        while (head != null) {
            qu.offerLast(head.val);
            head = head.next;
        }
        
        while (!qu.isEmpty() && top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right && !qu.isEmpty(); i++) {
                    result[top][i] = qu.pollFirst();
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom && !qu.isEmpty(); i++) {
                    result[i][right] = qu.pollFirst();
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left && !qu.isEmpty(); i--) {
                    result[bottom][i] = qu.pollFirst();
                }
                bottom--;
            } else {
                for (int i = bottom; i >= top && !qu.isEmpty(); i--) {
                    result[i][left] = qu.pollFirst();
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
    
        return result;
        
    }
}