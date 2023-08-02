public class Code48 {

    public void rotate(int[][] matrix) {

        // (1,1) -> (1,3)
        // (2,2) -> (2,3) 2=2, 3=4-2+1
        // (3,4) -> (4,2) 4=4, 2=4-3+1 (2,3) -> (3,1) 1=4-2-1
        // 列变行，x为行则列为m-x+1
        int count = 0;
        int n = matrix.length;
        while (count <= n * n) {
            for (int i = 1; i <= n / 2; i++) {
                for (int j = i - 1; j < n - i + 1; j++) {
                    int x = i-1;
                    int y = j;
                    int pre = matrix[x][y];
                    for (int k = 0; k < 4; k++) {
                        int tx = y;
                        int ty = n - x - 1;
                        int temp = matrix[tx][ty];
                        matrix[tx][ty] = pre;
                        pre = temp;
                    }
                }
            }
        }
    }
}
