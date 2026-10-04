class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        // Find length
        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode[] ans = new ListNode[k];

        int size = n / k;
        int extra = n % k;

        temp = head;

        for (int i = 0; i < k; i++) {

            ans[i] = temp;

            int partSize = size;

            if (extra > 0) {
                partSize++;
                extra--;
            }

            for (int j = 1; j < partSize; j++) {
                temp = temp.next;
            }

            if (temp != null) {
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;
            }
        }

        return ans;
    }
}