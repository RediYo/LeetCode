public class Offer46 {

  public int translateNum(int num) {
    //当前字符单独翻译的次数或者与前一个字符合并一起翻译的次数的最大值
    String str = String.valueOf(num);
    int[] tmp = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      tmp[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    int[] dp = new int[tmp.length];
    dp[0] = 1;
    int i;
    for (i = 1; i < tmp.length; i++) {
      if ((tmp[i - 1] * 10 + tmp[i] > 25) || tmp[i - 1] == 0) { //说明不能合并翻译
        dp[i] = dp[i - 1];
      } else {
        if (i - 2 > 0) {
          dp[i] = dp[i - 1] + dp[i - 2];
        } else {
          dp[i] = dp[i - 1] + 1;
        }
      }
    }
    return dp[i - 1];
  }
}
