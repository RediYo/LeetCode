public class Offer10_1 {

    public int fib(int n) {

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        int i;
        for(i=2;i<=n;i++){
            f[i]=(f[i-2]+f[i-1])%1000000007;
        }
        return f[i];
    }
}