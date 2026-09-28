class Solution {
    static boolean isSafeToPlace(char[][] board, int rowIndex, int colIndex) {

        int row = rowIndex;
        int col = colIndex;

        // Left side
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        // Upper-left diagonal
        row = rowIndex;
        col = colIndex;

        while (col >= 0 && row >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        // Lower-left diagonal
        row = rowIndex;
        col = colIndex;

        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

    static void solve(char[][] board, int n, int colIndex, List<List<String>> ans) {

        // Base case
        if (colIndex >= n) {
            // mota mota mtlb ans ready h ab usko ans list me add kro uske liee col ke hrr row pr jake uski value ko store krdo as a form of string 

            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            // ye call check kregi jha pr q ko insert krna cha rhe h voo place valid to h na apni ssaari requiredment full fill to kr rhi h na 
            if (isSafeToPlace(board, rowIndex, colIndex)) {

                // Choose
                board[rowIndex][colIndex] = 'Q';

                // Recursive call
                solve(board, n, colIndex + 1, ans);

                // Backtrack
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        //2D array bana lia n*n size ka  orr why char use here because string use me hogi Q or . store krenge thats why 
        char[][] board = new char[n][n];
         
         // sbko dot "." se fill kr diaa starting me koi queen place nhi h ok 
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();
        solve(board, n, 0, ans);
        return ans;
    }
}