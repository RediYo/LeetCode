package Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        System.out.println(evolutionaryRecord(new int[] { -1, 0, 0, 2 }));
    }

    public static String evolutionaryRecord(int[] parents) {

        // 0有两种记录方式，1为回退
        String result = "";
        int[] visited = new int[parents.length];
        int currentIndex = 0;
        Arrays.fill(visited, 0);
        while (!isAllVisited(visited)) {
            result += "0";
            visited[0] = 1;
            List<Integer> childs = childs(0, parents);
            for (Integer integer : childs) {
                visited[integer] = 1;
                currentIndex = integer;
                track(result, visited, currentIndex, parents);
            }
        }
        return result;
    }

    static void track(String res, int[] visited, int currentIndex, int[] parents) {

        List<Integer> childs = childs(currentIndex, parents);
        if (childs.size() == 0) {
            res += "1";
            currentIndex = parents[currentIndex];
            track(res, visited, currentIndex, parents);
        } else {
            res += "0";
            for (Integer integer : childs) {
                if (visited[integer] == 0) {
                    visited[integer] = 1;
                    currentIndex = integer;
                    track(res, visited, currentIndex, parents);
                }
            }
        }

        return;
    }

    static boolean isAllVisited(int[] visited) {
        int i = 0;
        for (; i < visited.length; i++) {
            if (visited[i] == 0) {
                break;
            }
        }
        if (i != visited.length) {
            return false;
        } else {
            return true;
        }
    }

    static List<Integer> childs(int i, int[] parents) {

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < parents.length; j++) {
            if (parents[j] == i) {
                list.add(Integer.valueOf(j));
            }
        }
        return list;
    }
}
