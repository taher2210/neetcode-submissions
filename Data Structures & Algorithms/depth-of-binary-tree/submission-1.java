

class Solution {
    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight, rheight)+1;
    }
    public int maxDepth(TreeNode root) {
        int m= height(root);
        return m;
    }
}
