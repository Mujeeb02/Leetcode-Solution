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
    public void flatten(TreeNode root) {
    //     List<Integer> list=new ArrayList<>();
    //     if(root==null){
    //         return;
    //     }
    //     root.left=null;
    //     root.right=null;
    //     find(root,list);
    //     TreeNode curr=root;
    //     for(int i=1;i<list.size();i++){
    //         curr.right=new TreeNode(list.get(i));
    //         curr=curr.right;
    //     }
    // }
    // static void find(TreeNode root,List<Integer> list){
    //     if(root==null){
    //         return;
    //     }
    //     list.add(root.val);
    //     find(root.left,list);
    //     find(root.right,list);
        if(root==null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right=root.left;
        root.left = null;
        while(root.right!=null){
            root = root.right;
        }
        root.right=temp;
    }
}