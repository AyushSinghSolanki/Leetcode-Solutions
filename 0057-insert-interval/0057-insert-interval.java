import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        boolean inserted = false;

        for (int i = 0; i < n; i++) {

            if (intervals[i][1] < newInterval[0]) {

                ans.add(intervals[i]);

            } else if (intervals[i][0] > newInterval[1]) {

                if (!inserted) {
                    ans.add(newInterval);
                    inserted = true;
                }

                ans.add(intervals[i]);

            } else {

                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if (!inserted) {
            ans.add(newInterval);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}