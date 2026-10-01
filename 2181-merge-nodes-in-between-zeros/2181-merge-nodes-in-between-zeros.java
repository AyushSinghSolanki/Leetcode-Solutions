
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode read = head.next;
        ListNode write = head;
         
       
         while(read != null){
         int sum = 0;
        // jbtk zero nhi milta add krte rho 

         while(read.val != 0){
            sum += read.val;
            read = read.next;
          }

        // now zero mil gya agr 
        write.val = sum;
        write.next = read.next;
         
         //update location one 
        read = read.next;
        write = write.next;
       }

        return head;

    }
}