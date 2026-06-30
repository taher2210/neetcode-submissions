class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are null, they are identical
        if (p == null && q == null) {
            return true;
        }

        // If one is null and the other is not, they are not identical
        if (p == null || q == null) {
            return false;
        }

        // If values are different, trees are not identical
        if (p.val != q.val) {
            return false;
        }

        // Recursively check if left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

    
