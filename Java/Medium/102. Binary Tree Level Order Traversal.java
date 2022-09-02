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
        List<List<Integer>> res = new ArrayList<>();
        levelOrder(root, res, 0);
        return res;
    }
    
    private void levelOrder(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) return;
        
        if (res.size() == level) {
            res.add(new LinkedList<>());
        }
        
        List<Integer> levelList = res.get(level);
        levelList.add(root.val);
        
        levelOrder(root.left, res, level + 1);
        levelOrder(root.right, res, level + 1);
    }
}
