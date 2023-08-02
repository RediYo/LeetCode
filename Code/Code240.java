public class Code240 {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //先右开始，小则向下，向下大则向左，向左则向下，向下则向右
        //右 下 左 下 右
        int dirs=0;
        int x=0, y=0;
        int m=matrix.length;
        int n=matrix[0].length;
        while(!(x==m&&(y==n||matrix[x][y+1]<target))){
            
            if(matrix[x][y]==target){
                return true;
            }
            if(dirs%5==0){
                if(y+1<=n||target>matrix[x][y+1]){
                    y++;
                }else{
                    dirs++;
                }
            }
            if(dirs%5==1){
                if(x+1<=m||target>matrix[x+1][y]){
                    x++;
                }else{
                    dirs++;
                }
            }
            if(dirs%5==2){
                if(x-1>=0||target>matrix[x-1][y]){
                    x--;
                    dirs++;
                }
            }
            if(dirs%5==3){
                if(x-1>=0||target>matrix[x+1][y]){
                    x++;
                }else{
                    dirs++;
                }
            }
            if(dirs%5==4){
                if(target>matrix[x+1][y]){
                    x++;
                }else{
                    dirs++;
                }
            }
        }
        return false;
    }
}
