
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // detect cycleeee
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while(fast != null){
            fast = fast.next;

            if(fast != null){
            fast = fast.next;
            slow = slow.next;

            if(fast == slow){
                hasCycle = true;
                break;
            }
        }
        }

        if(hasCycle == false){
            return null;
        }
        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;

        }
        ListNode startingNode = slow;
        return startingNode;

        
    }
        

    
}