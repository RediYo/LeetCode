public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        //如果当前字符被前面子串包含则当前子串从前面被包含字符后开始
        //如果当前字符没有被前面子串包含则当前子串+1
       
        if(s.length()==0){
            return 0;
        }
        String[] dp=new String[s.length()];
        dp[0]=s.charAt(0)+"";
        int res=1;
        for (int i=1; i < s.length(); i++) {
            if(dp[i-1].contains(s.charAt(i)+"")){
                dp[i]=dp[i-1].substring(dp[i-1].indexOf(s.charAt(i)+"")+1)+s.charAt(i);
            }else{
                dp[i]=dp[i-1]+s.charAt(i);
            }
            res = res > dp[i].length() ? res : dp[i].length();
        }
        return res;
    }
}