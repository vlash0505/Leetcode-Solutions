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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode slowTrack = head;
        ListNode fastTrack = head;
        while(slowTrack != null && fastTrack != null && fastTrack.next != null) {
            slowTrack = slowTrack.next;
            fastTrack = fastTrack.next.next;
            if(slowTrack == fastTrack) {
                return true;
            }            
        }
        return false;
    }
}