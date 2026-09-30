class Solution {
    public ListNode reverseList(ListNode head) {
        // single element yaaa firr last ement tk nhi aataa jbtk 
        if (head == null || head.next == null) {
            return head;  // 5 return hoga 
        }

        ListNode newHead = reverseList(head.next);  // 5 store hogyaa
       // head = 4
       // NewHead = 5

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}