/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        
        TreeNode cur;
        while (!qu.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                cur = qu.poll();
                level.add(cur.val);
                if (cur.left != null)
                    qu.offer(cur.left);
                if (cur.right != null)
                    qu.offer(cur.right);                
            }
            if (level.size() > 0) {
                result.add(level);
            }
        }
        
        return result;
    }
     
}