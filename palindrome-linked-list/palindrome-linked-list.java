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
    //tc=o(n/2)+o(n/2)+o(n/2)=o(3n/2)//[middle+reverse+ check left and right half]
    //sc=o(1)
    public boolean isPalindrome(ListNode head)
    {
        if(head==null||head.next==null)//if l.l is null or having single elemnt.
        return true;
        
        
        ListNode slow=head;
        ListNode fast=head;
        
        //find middle of the linked list
        while(fast.next!=null&&fast.next.next!=null)
        {
            //moment when fast reaches last or second last node slow pointer will be pointing to the middle of the l.l.
            slow=slow.next;
            fast=fast.next.next;
        }
        
         //reverse the right half
        slow.next=reverseList(slow.next);
        
        
        //move slow to right half
        slow=slow.next;
        
        
        //check if left half or right half equal or not
        while(slow!=null)
        {
            if(head.val!=slow.val)
                return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    
    
    ListNode reverseList(ListNode head) 
    {
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}