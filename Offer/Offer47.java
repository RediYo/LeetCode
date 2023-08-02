public class Offer47 {

    public int maxValue(int[][] grid) {

        int i=0,j=0;
        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[i].length; j++) {
                if(i-1>=0&&j-1>=0){
                    grid[i][j]+=Math.max(grid[i-1][j], grid[i][j-1]);
                }else if(i-1<0&&j-1>=0){
                    grid[i][j]+=grid[i][j-1];
                }else if(i-1>=0&&j-1<0){
                    grid[i][j]+=grid[i-1][j];
                }
            }
        }
        return grid[i-1][j-1];
    }
    
}
