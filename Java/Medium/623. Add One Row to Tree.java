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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newroot = new TreeNode(val);
            newroot.left = root;
            return newroot;
        }
        dfs(root, val, depth, 1);
        return root;
    }
    private void dfs(TreeNode root, int val, int depth, int track) {
        if (root == null) return;
        if (track < depth - 1) {
            dfs(root.left, val, depth, track + 1);
            dfs(root.right, val, depth, track + 1);
        } else {
            TreeNode tmp = root.left;
            root.left = new TreeNode(val);
            root.left.left = tmp;
            tmp = root.right;
            root.right = new TreeNode(val);
            root.right.right = tmp;
        }
    }
}
