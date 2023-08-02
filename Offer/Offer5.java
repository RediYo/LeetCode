public class Offer5 {

  public String replaceSpace(String s) {
    String str = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        str = str + "%20";
      } else {
        str = str + s.charAt(i);
      }
    }
    return str;
  }

  public String replaceSpace2(String s) {
    return s.replace(" ", "%20");
  }
}

