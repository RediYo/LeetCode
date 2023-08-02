public class Offer58_1 {

  public String reverseWords(String s) {
    String str = s.trim();
    String[] strs = str.split("\s+");
    StringBuilder result = new StringBuilder();
    for (int i = strs.length - 1; i >= 0; i--) {
      result.append(strs[i]);
      result.append(" ");
    }
    return result.deleteCharAt(result.lastIndexOf(" ")).toString();
  }
}
