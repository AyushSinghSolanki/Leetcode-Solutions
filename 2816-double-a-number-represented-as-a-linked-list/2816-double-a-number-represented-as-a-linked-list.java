
class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int carry = 0;

        while(curr != null){
         int val = curr.val * 2 + carry;
         curr.val = val % 10;
         carry = val / 10;

         if(curr.next == null && carry > 0){
           curr.next = new ListNode(carry);
            break;
}
         curr = curr.next;
        }
         return reverse(head);

    }
}