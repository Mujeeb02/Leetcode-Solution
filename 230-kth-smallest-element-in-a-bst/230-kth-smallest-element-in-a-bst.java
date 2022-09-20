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
    int res=-1;
    int a=0;
    
    public int kthSmallest(TreeNode root, int k) {
        // inorder(root,k);
         if(root==null){
            return res;
        }
        kthSmallest(root.left,k);
        a++;
        if(a==k){
            res=root.val;
        }
        kthSmallest(root.right,k);
        return res;
    }
//     public int inorder(TreeNode root,int k){
       
//         return res;
//     }
}