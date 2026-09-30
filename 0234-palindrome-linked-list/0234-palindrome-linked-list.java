class Solution {

    ListNode left;

    public boolean isPalindrome(ListNode head) {

        left = head;

        return check(head);
    }

    public boolean check(ListNode right) {

        if (right == null) {
            return true;
        }

        boolean ans = check(right.next);

        if (ans == false) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        left = left.next;
        return true;
    }
}