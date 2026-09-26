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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next ==null){
            return null;
        }
        int length =0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int midIdx= 0;
        if(length % 2 == 0){
            midIdx = length / 2;
        }
        else{
            midIdx = (length -1) / 2;
        }
        ListNode cur = head , prev= null ;
        for(int i=0; i<midIdx; i++){
            prev= cur;
            cur = cur.next;
        }
        if(prev != null ){
            prev.next = cur.next;
        } 
        return head;
    }
}