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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     int numOfNodes = 1;
        ListNode ptr1 = head;
        ListNode ptr2 = head;        
        while (ptr1.next != null)
        {
            numOfNodes++;
            ptr1 = ptr1.next;            
        }   
        
        if (numOfNodes == 1)
        {
            head = head.next;
            return head;
        } 
        
        int start = 0;
        if (numOfNodes == n)
        {
            head = head.next;
            return head;
        }
        while (ptr2.next != null)
        {
            start++;
            if (start == numOfNodes - n)
            {
                ptr2.next = ptr2.next.next;
                break;
            }  
            
            ptr2 = ptr2.next;          
           
        }
        return head;
    }
}