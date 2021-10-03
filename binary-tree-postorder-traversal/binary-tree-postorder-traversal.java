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

//use linkedlist and add values to the head then no revrse is needed.
//the l.l content get added like this:
//root
//right,root
//left,right,root
class Solution {
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> list =new LinkedList<Integer>();
        if(root==null)
        {
            return list;//returning empty list.
        }
        Stack<TreeNode> stack= new  Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode current=stack.pop();
            list.add(0,current.val);//means 0 index pe current.val ko insert kar do.
            if(current.left!=null)
            {
                stack.push(current.left);
            }
            if(current.right!=null)
            {
                stack.push(current.right);
            }
        }
        return list;
    }
}