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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode now = head;

        // get list size
        while (now != null) {
            length++;
            now = now.next;
        }

        // new head
        now = head;


        // select middle node
        for (int i = 0; i < length / 2; i++) {
            now = now.next;
        }

        return now;
    }
    
}