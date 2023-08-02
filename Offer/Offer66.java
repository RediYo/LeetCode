public class Offer66 {
    public int[] constructArr(int[] a) {
        
        int[] b=new int[a.length];
        for (int i = 0; i <b.length; i++) {
            b[i]=1;
            for (int j = 0; j < b.length; j++) {
                if(j!=i){
                    b[i]*=a[j];
                }
            }
        }
        return b;
    }
}