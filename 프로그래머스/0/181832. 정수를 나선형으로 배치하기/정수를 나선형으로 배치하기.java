class Solution {
    public int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int row = 0, col = 0;
        int dir = 0;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        while (num <= n * n) {
            matrix[row][col] = num++;
            int nextRow = row + dr[dir];
            int nextCol = col + dc[dir];
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || matrix[nextRow][nextCol] != 0) {
                dir = (dir + 1) % 4;
                nextRow = row + dr[dir];
                nextCol = col + dc[dir];
            }
            row = nextRow;
            col = nextCol;
        }
        
        return matrix;
    }
}
