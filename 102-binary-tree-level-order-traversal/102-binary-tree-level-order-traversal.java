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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
     //tc=O(N)//TRAVERSING FOR ALL THE NODE.
        //SC==O(N)//Q WILL STORE ALL THE NODE.
        
        
        
        
      Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        if(root==null) return ans;
        queue.offer(root);//push the root in q
        while(!queue.isEmpty())
        {
            int levelNum=queue.size();
            List<Integer> subList=new LinkedList<Integer>();
            for(int i=0;i<levelNum;i++)
            {
                //if there exist a left push it in the q.
                //if there exist a right push it in the q.
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                subList.add(queue.poll().val);//pop elem from Q and add it to subList
            }
            ans.add(subList);//after everything is over add it to ans array list and return ans.
        }
        return ans;
    }
}