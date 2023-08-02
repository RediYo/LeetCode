public class Code11 {

    public int maxArea(int[] height) {

        int max=0;
        //1.遍历
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int x = j-i;
                int y = Math.min(height[i], height[j]);
                max = Math.max(max, x*y);
            }
        }
        return max;
    }
}