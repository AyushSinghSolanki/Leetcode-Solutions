class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;

        while (temp != null) {

            ListNode nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            if (nodeToInsert.val < x) {
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;
            }
            else {
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
            }
        }

        lesserTail.next = greaterHead.next;

        return lesserHead.next;
    }
}