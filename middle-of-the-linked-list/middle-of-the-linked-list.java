/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode middleNode(ListNode head) 
    {
              //optimal method--> tortoise method
        //slow tortoise  at head //slow move by 1
        //and fast tortoise at head // fast move by 2
        //fast tor reaches last node or at null stop it and the position of slow will give the middle elemnt.
        //tc=o(n/2)
        //sc=0(1)
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}