class Solution {

    static void solve(int[] nums, int index,
                      List<List<Integer>> result) {

        // Base case
        if(index == nums.length){
            List<Integer> output = new ArrayList<>();

            for(int i : nums){
                output.add(i);
            }

            result.add(output);
            return;
        }

        // Har position par har element ko try karenge
        for(int i = index; i < nums.length; i++){

            // Choice
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            // Recursive call
            solve(nums, index + 1, result);

            // Backtrack
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        solve(nums, 0, result);

        return result;
    }
}