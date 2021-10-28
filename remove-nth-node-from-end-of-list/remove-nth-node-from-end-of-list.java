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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
            //tc=o(n)
            //sc=0(1)
        ListNode dummyNode=new ListNode();
    	dummyNode.next=head;
    	ListNode fast=dummyNode;
    	ListNode slow=dummyNode;
    	for(int i=1;i<=n;i++)
    	{
    	    fast=fast.next;//we move fast pointer to n iteration
    	}
    	while(fast.next!=null)//know we move fast n slow both till fast reaches to the end
    	{
    	    fast=fast.next;
    	    slow=slow.next;
    	}
    	slow.next=slow.next.next;//know cut the link
    	return dummyNode.next;
        
    }
}