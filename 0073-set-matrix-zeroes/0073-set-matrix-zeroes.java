class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Row aur Column ko mark karne ke liye
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Pass 1: Jahan 0 mile, uski row aur column mark kar do
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Pass 2: Marked rows aur columns ko 0 kar do
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}