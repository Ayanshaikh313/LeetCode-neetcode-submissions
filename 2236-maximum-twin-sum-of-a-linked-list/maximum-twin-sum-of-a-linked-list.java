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
    public int pairSum(ListNode head) {
        ArrayList<Integer> l0 = new ArrayList<>();
        if(head == null || head.next ==null){
            return 0;
        }
        ListNode temp = head;
        while(temp !=null){
            l0.add(temp.val);
            temp = temp.next;
        }
        int n = l0.size();
        int max =0;
        for(int i=0; i<n; i++){
            int x = l0.get(i) + l0.get(n-i-1);
            max = Math.max(max , x);
        }
        return max;
    }
}