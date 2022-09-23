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
    private TreeNode first;
    private TreeNode second;
    private TreeNode prev;
    private TreeNode middle;
    public void recoverTree(TreeNode root) {
        if(root==null) return;
        first=second=middle=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && second!=null){
            int temp=first.val;
            first.val=second.val;
            second.val=temp;
        }
        else if(first!=null && middle!=null){
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }
    }
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);   
        if(prev!=null && root.val<prev.val){
            if(first==null){
               first=prev;
                middle=root;
            }   
            else{
                second=root;
            }
                      
        } 
        prev=root; 
        inorder(root.right);
    }
    
}