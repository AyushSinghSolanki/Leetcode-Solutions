class Solution {

   static void solve(int[] nums, int index, ArrayList<Integer> output, List<List<Integer>> result ){
    // Base case
    if(index == nums.length){
            result.add(new ArrayList<>(output));
            return;
    }
        
        output.add(nums[index]);
        solve(nums, index + 1, output, result);
        output.remove(output.size() - 1);
        solve(nums, index + 1, output, result);
   }


    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
          solve(nums, 0, new ArrayList<>(), result);
          return result;
    

    }
}