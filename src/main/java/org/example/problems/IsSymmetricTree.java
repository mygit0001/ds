package org.example.problems;

public class IsSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode n1,TreeNode n2){
        if(n1==null && n2==null)
            return true;
        if(n1==null || n2==null || n1.val!=n2.val)
            return false;
        return isMirror(n1.left,n2.right) && isMirror(n1.right,n2.left);
    }
}
