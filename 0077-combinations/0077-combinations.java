class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(1, n, k, list, ans);
        return ans;
    }

    private void solve(int start, int n, int k, List<Integer> list,  List<List<Integer>> ans ){
        // base case bana dete h ab 

       if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i<=n; i++){
            list.add(i);

            //recursive call
            solve(i+1, n, k, list, ans);

            // backtracking now 
              list.remove(list.size() - 1);

        }
    }
}