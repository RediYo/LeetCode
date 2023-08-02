import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Code438 {
    
    public List<Integer> findAnagrams(String s, String p) {
        //1.步长为1进行滑动
        //2.当遇到非异位字母则滑动窗口移动到下一位
        List<Character> pList = new ArrayList<Character>();
        List<Character> sList = new ArrayList<Character>();
        List<Character> sList_2 = new ArrayList<Character>();

        for (Character character : p.toCharArray()) {
            pList.add(character);
        }
        int left=0,right=0;
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(pList.contains(s.charAt(i))){
                sList.add(s.charAt(i));
                right = i;
                if(right - left != p.length()){
                    break;
                }
                Collections.copy(sList_2, sList);
                Collections.sort(pList);
                Collections.sort(sList_2);
                if(Arrays.equals(pList.toArray(), sList_2.toArray())){
                    integers.add(left);
                }
                sList.remove(0);
                left++;

            }else{
                left = i;
                right = i;
            }
        }
        return integers;
    }

}
