
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int n = 1;

        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        k = k % n;

        if(k == 0){
            return head;
        }

        ListNode prev = head;

        for(int i = 1; i < n - k; i++){
            prev = prev.next;
        }

        ListNode newHead = prev.next;

        prev.next = null;
        temp.next = head;

        return newHead;
    }
}