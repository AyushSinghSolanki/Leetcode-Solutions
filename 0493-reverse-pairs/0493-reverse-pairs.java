class Solution {

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    static int mergeSort(int[] nums, int start, int end) {

        if (start >= end) {
            return 0;
        }

        int mid = start + (end - start) / 2;

        int count = 0;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid + 1, end);

        int j = mid + 1;

        for (int i = start; i <= mid; i++) {

            while (j <= end && (long) nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        merge(nums, start, mid, end);

        return count;
    }

    static void merge(int[] nums, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[start + x] = temp[x];
        }
    }
}