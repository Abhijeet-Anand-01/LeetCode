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
        List<Integer> res = new ArrayList<Integer>();
        rightSideView(root, res, 0);
        return res;
    }
    private void rightSideView(TreeNode root, List<Integer> res, int currDepth) {
        if(root == null) return;
        
        if(currDepth == res.size()) res.add(root.val);
        rightSideView(root.right, res, currDepth + 1);
        rightSideView(root.left, res, currDepth + 1);
    }
}
