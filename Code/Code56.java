import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Code56 {

    // 56. 合并区间
    public int[][] merge(int[][] intervals) {

        // 分析：区间按照左值进行排序【使用哈希表】
        // 思路：循环遍历，进行合并
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new FirstColumnComparator());
        int left = intervals[0][0], right = intervals[0][1];
        for (int i = 1; i < intervals.length;) {
            left = intervals[i - 1][0];
            right = intervals[i - 1][1];
            if (right >= intervals[i][0]) {
                while (i < intervals.length && right >= intervals[i][0] ) {// 合并区间
                    right = right > intervals[i][1] ? right : intervals[i][1];
                    i++;
                }
            } else {
                i++;
            }
            list.add(new int[] { left, right });
        }
        int[][] array = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

class FirstColumnComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] row1, int[] row2) {
        return Integer.compare(row1[0], row2[0]);
    }
}
