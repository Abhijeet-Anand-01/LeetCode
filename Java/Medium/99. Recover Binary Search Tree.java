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
public class Solution {
    TreeNode firstElement = null;
    TreeNode secondElement = null;
    TreeNode prevElement = null;
    
    public void recoverTree(TreeNode root) {
        
        inorderTraversal(root);
        
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }
    
    private void inorderTraversal(TreeNode root) {
        
        if (root == null)
            return;
            
        inorderTraversal(root.left);
        
        if (prevElement != null) {
            if (firstElement == null && prevElement.val > root.val) {
                firstElement = prevElement;
            }
            if (firstElement != null && prevElement.val > root.val) {
                secondElement = root;
            }        
        }
        prevElement = root;

        inorderTraversal(root.right);
    }
}
