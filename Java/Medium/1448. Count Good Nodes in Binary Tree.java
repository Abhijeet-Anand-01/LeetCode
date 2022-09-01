// Approach 1 : Using global variable

class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        goodNodes(root, Integer.MIN_VALUE);
        return count;
    }
    private void goodNodes(TreeNode root, int max) {
        if (root == null) return;
        if (root.val >= max) count++;
        max = Math.max(max, root.val);
        goodNodes(root.left, max);
        goodNodes(root.right, max);
    }
}


// Approach 2 : Without global variable

class Solution {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }
    
    private int goodNodes(TreeNode root, int max) {
        if (root == null) return 0;
        int count = root.val >= max ? 1 : 0;
        max = Math.max(max, root.val);
        count += goodNodes(root.left, max);
        count += goodNodes(root.right, max);
        return count;
    }
}
