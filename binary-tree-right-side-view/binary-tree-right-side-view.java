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
class Solution
{
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> result=new  ArrayList();
        RightView(root,result,0);
        return result;
    }
   public void RightView(TreeNode curr, List<Integer> result, int currDepth)
   {
        //If vector size is equal to the level then push_back its node value to the vector data structure.
//Otherwise call recursive_right for (node->right,level+1,vector)
//Call recursive_right for (node->left,level+1,vector)
        if(curr==null)
        {
            return;
        }
        if(currDepth==result.size())
        {
            result.add(curr.val);
        }
        RightView(curr.right,result,currDepth+1);
         RightView(curr.left,result,currDepth+1);
    }
}
