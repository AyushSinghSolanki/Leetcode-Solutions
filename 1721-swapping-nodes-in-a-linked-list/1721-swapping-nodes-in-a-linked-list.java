class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        for(int i = 1; i < k; i++){
            first = first.next;
        }

        ListNode temp = first;
        ListNode second = head;

        while(temp.next != null){
            temp = temp.next;
            second = second.next;
        }

        int tempvalue = first.val;
        first.val = second.val;
        second.val = tempvalue;

        return head;
    }
}