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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummy=new ListNode();//creatung a dummy node.
        ListNode temp=dummy;//pointing temp node to dummy
        int carry=0;
        while(l1!=null || l2!=null || carry==1)
        {
            int sum=0;
            if(l1!=null)
            {
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum=sum+l2.val;
                l2=l2.next;
            }
            sum=sum+carry;//adding carry to the sum
            carry=sum/10;// re initialising carry i.e new carry
            ListNode node=new ListNode(sum % 10);//create a new node and add sumaation%10 to it.   
            temp.next=node;//temp will point to the node.
            temp=temp.next;//move temp  by 1
        }
        return dummy.next;//dummy next will have the head of that l.l which would  have summation of two l.l
    }
}