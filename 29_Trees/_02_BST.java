class _02_BST {
    public TreeNode deleteNode(TreeNode root, int key) {
    // searching process
    if (root == null) return root;
    
    if (root.val < key) {
        root.right = deleteNode(root.right, key);
    } else if (root.val > key) {
        root.left = deleteNode(root.left, key);
    } else {
        // if found
        // leaf Node or single child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }
        
        // two children
        TreeNode IS = findInorderSuccessor(root.right);
        root.val = IS.val;
        root.right = deleteNode(root.right, IS.val);
    }

    return root;
}

    private TreeNode findInorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

}