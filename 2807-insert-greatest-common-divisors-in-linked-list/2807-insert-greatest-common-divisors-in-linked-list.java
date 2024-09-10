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

public class Solution {
     public int gcd(int a,int b){
    if (b==0)
        return a;
    return gcd(b,a%b);
 }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode current=head;
        while(current.next!=null){
            int g=gcd(current.val,current.next.val);
            ListNode newNode = new ListNode(g, current.next);
            current.next=newNode;
            current=current.next.next;
        }
        return head;
        
        
    }
}