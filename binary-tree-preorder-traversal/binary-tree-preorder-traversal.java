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
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> res =new ArrayList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode curNode=s.pop();
            res.add(curNode.val);
            if(curNode.right !=null)s.push(curNode.right);
            if(curNode.left !=null)s.push(curNode.left);
            
        }
        return res;
        
    }
}