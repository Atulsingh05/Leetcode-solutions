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

         // Image result for what is balanced binary tree
       // A balanced binary tree is a binary tree structure in which the left and right subtrees 
       //  of every node differ in height by no more than 1. 



//balanced bt=height(left)-height(right)<=1
//this for every node in tree


        class Solution
        {
    public boolean isBalanced(TreeNode root)
    {
        return height (root) != -1;
    }
    int height(TreeNode root)
     {
        if (root == null) return 0;
        
        int leftHeight = height (root.left);
        if (leftHeight == -1) return -1;//means there is no left height.
        int rightHeight = height (root.right);
        if (rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}