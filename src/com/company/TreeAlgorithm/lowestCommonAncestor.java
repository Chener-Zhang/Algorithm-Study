package com.company.TreeAlgorithm;

public class lowestCommonAncestor {
    public TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recurseTree(root, p, q);
        System.out.println(ans.val);
        return ans;
    }

    public boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

        if (currentNode == null) {
            return false;
        }
        int left = recurseTree(currentNode.left, p, q) ? 1 : 0;
        int right = recurseTree(currentNode.right, p, q) ? 1 : 0;
        int mid = (currentNode.val == p.val || currentNode.val == q.val) ? 1 : 0;
        if (mid + left + right == 2) {

            ans = currentNode;
        }

        return (mid + left + right > 0);
    }
}
