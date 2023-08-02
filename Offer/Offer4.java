public class Offer4 {

  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if (matrix.length == 0) {
      return false;
    } else if (matrix.length <= 2 || matrix[0].length <= 2) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] == target) {
            return true;
          }
        }
      }
    }
    int i = 0, j = 0, temp_i = 0;
    int n = matrix.length, m = matrix[0].length;
    while (i < n - 1 && j < m - 1) {
      if (matrix[n - 1][j] < target) {
        j = j + 1;
      } else if (matrix[m - 1][j] < target) {
        i = i + 1;
        temp_i = i;
      } else {
        if (
          matrix[i][j] == target ||
          matrix[i + 1][j] == target ||
          matrix[i][j + 1] == target
        ) {
          return true;
        } else if (matrix[i + 1][j] > target && matrix[i][j + 1] > target) {
          return false;
        }
      }
      if (i < n - 2) {
        i++;
      } else {
        i = temp_i;
        j += 1;
      }
    }
    return false;
  }
}
