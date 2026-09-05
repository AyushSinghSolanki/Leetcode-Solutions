class Solution {

    static void solve(int n, int open, int close,
                      StringBuilder output,
                      List<String> result) {

        // Base case
        if(output.length() == 2 * n){
            result.add(output.toString());
            return;
        }

        // Choice 1: Opening bracket '('
        if(open < n){
            output.append('(');

            solve(n, open + 1, close, output, result);

            output.deleteCharAt(output.length() - 1);
        }

        // Choice 2: Closing bracket ')'
        if(close < open){
            output.append(')');

            solve(n, open, close + 1, output, result);

            output.deleteCharAt(output.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        solve(n, 0, 0, new StringBuilder(), result);

        return result;
    }
}