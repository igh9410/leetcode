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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        addNodes(root, result, 0);
        return result;
    }
    
    public void addNodes(TreeNode node, List<Integer> result, int level) {
        if (node == null)
            return;
        if (level == result.size())
            result.add(node.val);
        if (node.right != null) {
            addNodes(node.right, result, level + 1);
        }
        if (node.left != null) {
            addNodes(node.left, result, level + 1);
        }
    }
}