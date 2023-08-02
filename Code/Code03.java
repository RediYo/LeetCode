public class Code03 {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<1){
            return 0;
        }
        //1.滑动窗口
        //2.left为滑动窗口重复位置
        int left=0;
        int right=0;
        int maxLen=1;
        
        boolean flag=false;//存在重复标识
        int repeat=left;
        for (int i = 1; i < s.length(); i++) {
            
            for (int j = left; j <= right; j++) {
                if(s.charAt(j)==s.charAt(i)){
                    flag=true;
                    repeat=j;
                    break;
                }
            }
            if(flag){
                left=repeat+1;
                flag=false;
            }
            right=i;
            maxLen=maxLen > right-left+1?maxLen:right-left+1;
            
        }
        return maxLen;
    }
}
