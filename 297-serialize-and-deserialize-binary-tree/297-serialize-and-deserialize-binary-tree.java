/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder();
        getstring(root,s);
        return s.toString();
    }
    void getstring(TreeNode root, StringBuilder s){
        if(root==null){
            s.append("null,");
            return;
        }
        s.append(root.val+",");
        getstring(root.left,s);
        getstring(root.right,s);        
    }
    int index;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str=data.split(",");
        index=0;
        return helper(str);
    }
    TreeNode helper(String[] str){
        if(index>=str.length || str[index].equals("null")){
            index++;
            return null;
        }
        
        TreeNode root=new TreeNode(Integer.parseInt(str[index++]));
        root.left=helper(str);
        root.right=helper(str);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));