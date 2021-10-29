/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA == null || headB == null) return null;
    
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( dummy1 != dummy2)
        {
            //for the end of first iteration, we just reset the pointer to the head of                     another linkedlist
            //we keep on traversing till both the dummy node are at the  same position.
            dummy1 = dummy1 == null? headB : dummy1.next;
            //if dummy1 ==null then it move to the head of other l.l elese move dummy1 by 1.
            dummy2 = dummy2 == null? headA : dummy2.next;
            //if dummy2 ==null then it move to the head of other l.l elese move dummy2 by 1.
            
        }
        //after we are done traversing if they are equal return dummy1
        //if they r not equal we return null.
        return dummy1;

    }
}