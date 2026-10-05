class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        int i = 1;
        List<Integer> creticalPoint = new ArrayList <>();

        while(curr != null && curr.next != null){
           if( curr.val > prev.val && curr.val > curr.next.val){
            creticalPoint.add(i);
           }

            if( curr.val < prev.val && curr.val < curr.next.val){
            creticalPoint.add(i);
           }

           curr = curr.next;
           prev = prev.next;
           i = i+1;
        }

        if(creticalPoint.size() < 2){
            return new int[]{-1, -1};
        }

        int minDistance = Integer.MAX_VALUE;

        for(int j = 1; j < creticalPoint.size(); j++){
            int distance = creticalPoint.get(j) - creticalPoint.get(j - 1);

            minDistance = Math.min(minDistance, distance);
        }

        int maxDistance = creticalPoint.get(creticalPoint.size() - 1) - creticalPoint.get(0);

        return new int[]{minDistance, maxDistance};
    }
}