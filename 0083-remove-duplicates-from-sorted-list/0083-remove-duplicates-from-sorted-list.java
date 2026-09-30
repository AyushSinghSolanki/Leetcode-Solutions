
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
    return head;
}
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null){
            if(prev.val != curr.val){ // no duplicate clne do aage 
                curr = curr.next;
                prev = prev.next;
            }
            else {
                 prev.next = curr.next;
                 curr = curr.next;

            }

        } return head;
    }
}