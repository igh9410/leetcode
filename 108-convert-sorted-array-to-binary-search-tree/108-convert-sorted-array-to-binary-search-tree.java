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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        int mid = nums.length / 2;
        TreeNode result = new TreeNode(nums[mid]);
        //result.left = new TreeNode(nums[mid/2])
        //result.right = new TreeNode(nums[(mid+nums.length - 1)/2])
        int[] leftNums = Arrays.copyOfRange(nums, 0, mid);
        int[] rightNums = Arrays.copyOfRange(nums, mid + 1, nums.length);
        result.left = sortedArrayToBST(leftNums);
        result.right = sortedArrayToBST(rightNums);
        return result;
        
        
    }
}