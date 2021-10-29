/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    
    public void deleteNode(ListNode node)
    {
        node.val = node.next.val;//copying the node ke next ka value in node value.
    node.next = node.next.next;//and then linking it to node ke next ka next.
    }
}