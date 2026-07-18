class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] next = new int[m][n];

       
        int[][] dir = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1},  {1,0},  {1,1}
        };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;

                for (int[] d : dir) {
                    int r = i + d[0];
                    int c = j + d[1];

                    if (r >= 0 && r < m && c >= 0 && c < n
                            && board[r][c] == 1) {
                        live++;
                    }
                }

                if (board[i][j] == 1) {

                    if (live < 2) {
                        next[i][j] = 0;
                    }
                    else if (live == 2 || live == 3) {
                        next[i][j] = 1;
                    }
                    else {
                        next[i][j] = 0;
                    }

                } else {

                    if (live == 3) {
                        next[i][j] = 1;
                    } else {
                        next[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = next[i][j];
            }
        }
    }
}