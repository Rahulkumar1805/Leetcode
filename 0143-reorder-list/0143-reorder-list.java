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
    public void reorderList(ListNode head) {

        ListNode right;

        ListNode fast = head;
        ListNode slow = head;
        ListNode curr = head;
        ListNode prev = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){
            prev.next = null;
            right = slow;
        }
        else{
            right = slow.next;
            slow.next = null;
        }
        right = reverse_list(right);

        curr = head;
        while(right != null){
            ListNode nxt = curr.next;
            ListNode temp = new ListNode(right.val);
            curr.next = temp;
            temp.next = nxt;
            curr = nxt;
            right = right.next;
        }
    }

    ListNode reverse_list(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp ;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    void print_list(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}