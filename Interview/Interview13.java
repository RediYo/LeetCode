class Interview13 {

    int sum = 0;

  public int movingCount(int m, int n, int k) {
    int[][] flag = new int[m][n];
    for(int i=0;i<flag.length;i++){
        for(int j=0;j<flag[i].length;j++){
            flag[i][j]=0;
        }
    }
    flag[0][0] = 1;
    track(0, 0, m, n, k, sum, flag);
    return sum;
  }

  public void track(int i, int j, int m, int n, int k, Integer sum, int[][] flag){


    if(i-1>0&&((i-1)/10+(i-1)%10+j/10+j%10)<k){
        sum++;
        flag[i-1][j] = 1;
        track(i-1, j, m, n, k, sum, flag);
    }
    if(j-1>0&&((j-1)/10+(j-1)%10+i/10+i%10)<k){
        sum++;
        flag[i-1][j] = 1;
        track(i, j-1, m, n, k, sum, flag);
    }
    if(i+1<m&&((i+1)/10+(i+1)%10+j/10+j%10)<k){
        sum++;
        flag[i-1][j] = 1;
        track(i+1, j, m, n, k, sum, flag);
    }
    if(j+1<n&&((j+1)/10+(j+1)%10+i/10+i%10)<k){
        sum++;
        flag[i-1][j] = 1;
        track(i-1, j, m, n, k, sum, flag);
    }
  }
}
