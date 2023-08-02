public class offer63 {
    
    public int maxProfit(int[] prices) {

        int in=0, out=0, max=0;
        for(int i=0;i<prices.length;i++){
            in=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>in){
                    out=prices[j];
                    if((out-in)>max){
                        max=out-in;
                    }
                }
            }
        }
        return max;
    }
}
