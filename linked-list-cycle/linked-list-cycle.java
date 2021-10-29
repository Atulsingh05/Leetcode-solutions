/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        if(head == null || head.next == null)    
            return false;
                // //tortoise n rabiit algo or floyyd algo
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//slow ko 1 step se move karayenge
            fast=fast.next.next;//fast ko 2 step se move kra denge
            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }
}