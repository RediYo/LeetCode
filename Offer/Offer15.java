public class Offer15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        String str = Integer.toUnsignedString(n, 2);
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        return count;
    }
}