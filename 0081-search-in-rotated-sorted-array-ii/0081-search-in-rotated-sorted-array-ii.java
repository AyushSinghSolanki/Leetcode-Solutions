class Solution {
    public boolean search(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Target mil gaya
            if (nums[mid] == target) {
                return true;
            }

            // Duplicate case
            if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
                s++;
                e--;
                continue;
            }

            // Left half sorted
            if (nums[s] <= nums[mid]) {

                // Target left sorted half mein hai
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                } 
                else {
                    s = mid + 1;
                }
            }

            // Right half sorted
            else {

                // Target right sorted half mein hai
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } 
                else {
                    e = mid - 1;
                }
            }
        }

        return false;
    }
}