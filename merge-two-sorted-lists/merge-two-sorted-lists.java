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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(1);
        ListNode headPrev = current;
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            } else {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }
        }
        while(l1 != null) {
            current.next = l1;
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            current.next = l2;
            current = current.next;
            l2 = l2.next;
        }
        return (headPrev.next);
    } 
}