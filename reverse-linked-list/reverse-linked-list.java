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
//ITERATIVE SOLUTION USING  3 POINTERS
class Solution {
    public ListNode reverseList(ListNode head) 
    {
      ListNode prev=null;
      ListNode current=head;
        ListNode next=null;
       
        while(current!=null)
        {
             next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }
}




class Solution 
{
    public ListNode reverseList(ListNode head)
    {
        ListNode dummyNode = null;
        while (head != null) 
        {
            ListNode next = head.next;
            head.next = dummyNode;//pointing head to null
            dummyNode = head;
            head = next;
        }
        return dummyNode;//till head become null and next become null and dummy reaches to last node.
        //then return dummy node.
    }
}
