package org.example.problems;

import java.util.*;
public class BinaryTreeLevelOrderTraversal {


    public List<List<Integer>> levelOrder(TreeNode root) {
        RecursiveTraversal recursiveTraversal=new RecursiveTraversal();
        return recursiveTraversal.levelOrder(root);
    }

}

class RecursiveTraversal{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        levelOrder(root,0,ans);
        return ans;
    }

    private void levelOrder(TreeNode node,int level,List<List<Integer>> ans){
        if(node==null)
            return;
        if(level==ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(node.val);

        levelOrder(node.left,level+1,ans);
        levelOrder(node.right,level+1,ans);
    }
}

class BFSTraversal{
     public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<>();

         List<List<Integer>> levelOrderTraverse=new ArrayList<>();
         if(root==null){
             return levelOrderTraverse;
         }
         q.add(root);

         while(!q.isEmpty()){
             List<Integer> row=new ArrayList<>();
             int n=q.size();
             for(int i=0;i<n;i++){
                 TreeNode node=q.poll();
                 row.add(node.val);

                 if(node.left!=null)
                 q.add(node.left);
                 if(node.right!=null)
                 q.add(node.right);
             }
             levelOrderTraverse.add(row);
         }

         return levelOrderTraverse;
     }

}