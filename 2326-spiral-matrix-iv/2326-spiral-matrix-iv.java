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
        int[][] a = new int[m][n];
        int r = 0, c = 0, dir = 0;
        int[] dc = {1, 0, -1, 0};
        int[] dr = {0, -1, 0, 1};
        for(int i = 0;i < m;i++)Arrays.fill(a[i], -1);
        while(head != null){
            a[r][c] = head.val;
            head = head.next;
            if(head == null)break;
            while(true){
                int nr = r + dr[dir];
                int nc = c + dc[dir];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && a[nr][nc] == -1){
                    r = nr;
                    c = nc;
                    break;
                }
                dir = (dir+1)&3;
            }
        }
        return a;
    }
}