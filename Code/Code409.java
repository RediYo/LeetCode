import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class LeetCode409 {
    public int longestPalindrome(String s) {// 回文子串为正着读与反着读一致的字符串，构造最长子串故统计偶数次字符+1

        Set<Character> cSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {// 统计不同的字符数
            cSet.add(s.charAt(i));
        }
        int count = 0;

        Iterator<Character> iterator = cSet.iterator();
        while (iterator.hasNext()) {
            char cha = iterator.next();
            int even = 0;
            for (int j = 0; j < s.length(); j++) {
                if (cha == s.charAt(j)) {
                    even++;
                }
            }
            count = count + (even % 2 == 0 ? even : even - 1);
        }
        if(s.length()>count){
            count++;
        }

        return count;
    }
}