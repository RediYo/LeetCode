import java.util.ArrayList;
import java.util.List;

public class Code54 {
    
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int row=0, col=0;
        while(list.size()<=m*n){
            for (; col < n; col++) {
                list.add(Integer.valueOf(matrix[0][col]));
            }
            row++;
            col--;
            for (; row < m; row++) {
                list.add(Integer.valueOf(matrix[col][row]));
            }
            col--;
            row--;
        }
        return null;
    }
}
