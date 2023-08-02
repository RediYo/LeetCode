import java.util.HashSet;
import java.util.Set;

public class Offer50 {

  public char firstUniqChar(String s) {
    Set<Character> s_c = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (s_c.contains(s.charAt(i))) {
        return ' ';
      }
      s_c.add(s.charAt(i));
    }
    return ' ';
  }
}
