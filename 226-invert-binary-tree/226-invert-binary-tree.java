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
    public TreeNode invertTree(TreeNode root) {
        // if(root==null || root.left==null || root.right==null){
        //     return null;
        // }
        // TreeNode temp=root;
        // if(root!=null && root.left!=null && root.right!=null){
        // temp=root.left;
        // root.left=root.right;
        // root.right=temp;
        // }
        // if(root.left!=null){
        //     invertTree(root.left);
        //     }
        // if(root.left!=null){
        //     invertTree(root.right);        
        // }        
        // return root;
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}